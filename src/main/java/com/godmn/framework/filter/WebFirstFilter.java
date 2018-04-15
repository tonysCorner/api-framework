package com.godmn.framework.filter;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.godmn.framework.Constants;
import com.godmn.framework.controller.HttpServletResponseCopier;
import com.godmn.framework.controller.XssFilterRequestWrapper;
import com.godmn.framework.exception.CodeMsgDef;
import com.godmn.framework.resp.ResponseUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.weyao.common.CookieHelper;
import com.weyao.common.JsonHelper;
import com.godmn.framework.resp.Response;
import com.godmn.framework.resp.Ret;
import com.godmn.framework.util.StrUtil;

import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;

/**
 *
 */
@Component("firstFilter")
public class WebFirstFilter implements Filter {
	private static final Log logger = LogFactory.getLog(WebFirstFilter.class);

	private static final String URL_CHARSET="utf-8";

	private Set<String> noChecks = new HashSet<String>();
	private Set<String> allowOriginDomain =  new HashSet<String>();

	private String loginUrl;

	@Override
	public void destroy() {

	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest request = new XssFilterRequestWrapper((HttpServletRequest) req);
		req=request;
		HttpServletResponse response = (HttpServletResponse) resp;
		String servletPath=request.getServletPath();

		//设置跨域信息
		this.setCORS(request, response);

		long cid=0;
		if(isAccessUri(request.getServletPath())){
			checkLogin(request, response);
			logger.debug("no auth check servletPath: "+servletPath);
		}else if((cid=checkLogin(request, response))>0){
			logger.debug("auth checked servletPath: "+servletPath);
		}else{
			String XRequestedWith=request.getHeader("X-Requested-With");
			logger.debug("auth check failed servletPath: "+servletPath+", XRequestedWith: "+XRequestedWith);
			if(XRequestedWith!=null && XRequestedWith.equalsIgnoreCase("XMLHttpRequest")){
				Response ret = ResponseUtils.instance(CodeMsgDef.系统错误);
				response.setContentType("application/json;charset="+URL_CHARSET);
				response.getWriter().write(JsonHelper.toJson(ret));
				return;
			}else{
				String contextPath=request.getContextPath();
				String returnUrl=request.getRequestURL().toString();
				String queryString=request.getQueryString();
				if(!StringUtils.isBlank(queryString)){
					returnUrl+="?"+queryString;
				}
				response.sendRedirect(contextPath+loginUrl+"?returnUrl="+URLEncoder.encode(returnUrl, URL_CHARSET));
				return;
			}
		}

        HttpServletResponseCopier respCopier = new HttpServletResponseCopier(response);
        filterChain.doFilter(req, respCopier);
        try {
            respCopier.flushBuffer();
            String url = request.getRequestURL().toString();
            String uri = getUri(request);
            if (StringUtils.isNotBlank(uri)) {
                url = url + "?" + uri;
            }
            String realIp = getRealIp(request);
            String XRequestedWith = request.getHeader("X-Requested-With");
            String contentType = response.getContentType();
            String responseStr = null;
            if (XRequestedWith != null && XRequestedWith.equalsIgnoreCase("XMLHttpRequest") && contentType != null && contentType.contains("application/json")) {
                byte[] copy = respCopier.getCopy();
                responseStr = (new String(copy, response.getCharacterEncoding()));
            } else {
                Map<String, String> responseMap = new HashMap<String, String>();
                Collection<String> hearderNames = respCopier.getHeaderNames();
                for (String name : hearderNames) {
                    responseMap.put(name, response.getHeader(name));
                }
                if (responseMap.size() > 0) {
                    responseStr = JSONObject.fromObject(responseMap).toString();
                } else {
                    byte[] copy = respCopier.getCopy();
                    responseStr = (new String(copy, response.getCharacterEncoding()));
                }
            }
            if (responseStr != null && responseStr.getBytes().length > 900) {
                responseStr = StrUtil.substring(responseStr, 900, "");
            }
        } catch (Exception e) {
            logger.error(String.format("保存日志失败：【%s】",e.getMessage()),e);
        }
	}


	public static String getUri(ServletRequest req){
		try {
			Map<String, String[]> parameMap = null;
			if (req != null) {
				parameMap = req.getParameterMap();
			}
			if (parameMap != null && parameMap.size() > 0) {
				StringBuilder builder = new StringBuilder();
				Iterator<Entry<String, String[]>> iterator = parameMap.entrySet().iterator();
				if (iterator.hasNext()) {
					builder.append(buildParame(iterator.next()));
				}
				while (iterator.hasNext()) {
					builder.append("&" + buildParame(iterator.next()));
				}
				return builder.toString();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	private static String buildParame(Entry<String, String[]> entry){
		try {
			if (entry != null) {
				StringBuilder builder = new StringBuilder();
				builder.append(entry.getKey() + "=");
				String[] values = entry.getValue();
				if (values != null && values.length > 0) {
					if (values.length == 1) {
						builder.append(values[0]);
					} else {
						builder.append(StringUtils.join(values, ","));
					}
				}
				return builder.toString();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	protected long checkLogin(HttpServletRequest request,
			HttpServletResponse response)throws IOException, ServletException{
		/*String ssid=CookieHelper.getCookieValue(request, Constants.COOKIE_SESSION_ID_KEY);
		if(ssid==null){
			return 0;
		}*/
		//TODO jedisService replace
		/*String token=jedisService.valueOps.get(String.format(KEY_SESSION_ID,ssid));
		if(token!=null){
			//refresh session timeout
			jedisService.valueOps.getOperations().expire(String.format(KEY_SESSION_ID,ssid), SESSION_TIMEOUT, TimeUnit.SECONDS);
			return setCustomer(request, token);
		}*/

		return 0;
	}

	private static String getRealIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip != null && ip.contains(",")) {
			ip = ip.substring(0, ip.indexOf(","));
		}
		if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Real-IP");
		}

		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		// 如果是本地测试或以上步骤没有取得ip没从请求参数中获取IP
		if (("127.0.0.1".equals(ip) || StringUtils.isEmpty(ip)) && !StringUtils.isEmpty(request.getParameter("ip")))
			ip = request.getParameter("ip");
		return ip;
	}

	protected long setCustomer(ServletRequest req, String token) {
		/*String cusJson = null ;
		try{
			if(token==null)return 0;
			cusJson = jedisService.valueOps.get(String.format(CUS_INFO_KEY_TEMPLET,token));
			if(cusJson==null)return 0;
			Customer cus = (Customer)JsonHelper.fromJson(cusJson, Customer.class);
			req.setAttribute(CURR_CUST, cus);
			if(cus!=null){
				return cus.getCid();
			}
		}catch(Exception e){
			logger.error("h5 WebFirstFilter setCustomer error!",e);
		}*/
		return 0;
	}

	protected boolean isAccessUri(String uri) {
		if (noChecks == null || noChecks.size() <= 0){
			return true;
		}

		if (StringUtils.isBlank(uri)){
			return false;
		}
		for(String noCheck: noChecks){
			if(uri.startsWith(noCheck)){
				return true;
			}
		}

		return false;
	}

	private void setCORS(HttpServletRequest request, HttpServletResponse response) throws MalformedURLException {

		String referer = request.getHeader("referer");
		logger.debug("referer = " + referer);
		if(StringUtils.isNotBlank(referer)) {
			URL url = new URL(referer);
			String domain = url.getProtocol() + "://" + url.getHost();
			if (url.getPort() != -1) {
				domain = domain + ":" + url.getPort();
			}

			logger.debug("domain = " + domain);
			if (CollectionUtils.isNotEmpty(this.allowOriginDomain) && this.allowOriginDomain.contains(domain)) {
				response.setHeader("Access-Control-Allow-Origin", domain);
				response.setHeader("Access-Control-Allow-Credentials", "true");
				response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
				//response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers,Authorization, X-Requested-With, Last-Modified, If-Modified-Since");
				response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-HTTP-Method-Override, Cookie, AccessToken");
			}
		}
	}


	public void init(FilterConfig config) throws ServletException {
		String noCheckStr = config.getInitParameter("nocheck");
		if (StringUtils.isNotBlank(noCheckStr)) {
			String[] arr=org.springframework.util.StringUtils.tokenizeToStringArray(noCheckStr, ",; \t\n");
			for (String str : arr) {
				noChecks.add(str);
			}
		}
		loginUrl=config.getInitParameter("login");

		String allowOriginDomain1 = config.getInitParameter("allowOriginDomain");
		if(StringUtils.isNotBlank(allowOriginDomain1)) {
			String[] urlArray = org.springframework.util.StringUtils.tokenizeToStringArray(allowOriginDomain1, ",;\r\n\t");
			if(urlArray != null && urlArray.length > 0) {
				Collections.addAll(this.allowOriginDomain, urlArray);
			}
		}

	}
}
