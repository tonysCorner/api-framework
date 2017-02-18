package com.weyao.web.quote.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weyao.srv.support.SrvException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weyao.web.quote.resp.ResponseUtils;
import com.weyao.web.quote.resp.Ret;
public class BaseController{
	private static final Log logger = LogFactory.getLog(BaseController.class);

	@ExceptionHandler({RuntimeException.class,Exception.class})
	@ResponseBody
	public  Object runtimeExceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) {
		if(logger.isDebugEnabled()){
			logger.debug(e.getMessage(), e);
		}else{
			logger.error(e.getClass().getSimpleName() + ":" + e.getMessage());
		}
		Ret ret = new Ret(Ret.EXCEPTION_ERROR.code, e.getMessage()==null?Ret.EXCEPTION_ERROR.msg:e.getMessage());
		
		String XRequestedWith=request.getHeader("X-Requested-With");
		if(XRequestedWith!=null && XRequestedWith.equalsIgnoreCase("XMLHttpRequest")){
			return ResponseUtils.instance(ret.getCode(),ret.getMsg(), null);
		}else{
			try {
				String contextPath=request.getContextPath();
				StringBuffer errUrl=new StringBuffer(contextPath);
				errUrl.append("/error.html?code=")
					.append(ret.getCode())
					.append("&errMsg=")
					.append(URLEncoder.encode(ret.getMsg(), "utf-8"));
				response.sendRedirect(errUrl.toString());
			} catch (IOException e1) {
				logger.debug(e1.getMessage(), e1);
			}
			return null;
		}
	}
	
	@ExceptionHandler({SrvException.class})
	public @ResponseBody
	Object srvExceptionHandler(SrvException e) {
		
		if(logger.isDebugEnabled()){
			logger.debug("SrvException: msg: "+e.getMsg()+", code: "+e.getCode(), e);
		}else{
			logger.error("SrvException: msg: "+e.getMsg()+", code: "+e.getCode());
		}		
		return ResponseUtils.instance(e.getCode(),e.getMsg()==null?"":e.getMsg(), e.getData());
	}
}
