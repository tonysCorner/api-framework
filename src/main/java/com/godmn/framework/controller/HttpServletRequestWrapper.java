//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godmn.framework.controller;

import com.weyao.common.F;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.lang.StringUtils;

public class HttpServletRequestWrapper implements HttpServletRequest {
    private HttpServletRequest request;
    private Map<String, String[]> params = null;

    public static HttpServletRequest wrap(HttpServletRequest req, String queryString) {
        return new HttpServletRequestWrapper(req, F.parseQueryString(queryString));
    }

    public static HttpServletRequest wrap(HttpServletRequest req, String replaceParamName, String[] replaceParamValue) {
        Map params = req.getParameterMap();
        HashMap map = new HashMap();
        Iterator var6 = params.entrySet().iterator();

        while(var6.hasNext()) {
            Entry param = (Entry)var6.next();
            map.put((String)param.getKey(), (String[])param.getValue());
        }

        map.put(replaceParamName, replaceParamValue);
        return new HttpServletRequestWrapper(req, map);
    }

    private HttpServletRequestWrapper(HttpServletRequest req, Map<String, String[]> params) {
        this.request = req;
        this.params = params;
    }

    public String getParameter(String name) {
        if(this.params != null) {
            String[] vals = (String[])this.params.get(name);
            return vals != null?StringUtils.join(vals, ","):null;
        } else {
            return this.request.getParameter(name);
        }
    }

    public Enumeration<String> getParameterNames() {
        return this.params != null?Collections.enumeration(this.params.keySet()):this.request.getParameterNames();
    }

    public String[] getParameterValues(String name) {
        return this.params != null?(String[])this.params.get(name):this.request.getParameterValues(name);
    }

    public Map<String, String[]> getParameterMap() {
        return this.params != null?this.params:this.request.getParameterMap();
    }

    public Object getAttribute(String name) {
        return this.request.getAttribute(name);
    }

    public Enumeration<String> getAttributeNames() {
        return this.request.getAttributeNames();
    }

    public String getCharacterEncoding() {
        return this.request.getCharacterEncoding();
    }

    public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
        this.request.setCharacterEncoding(env);
    }

    public int getContentLength() {
        return this.request.getContentLength();
    }

    public String getContentType() {
        return this.request.getContentType();
    }

    public ServletInputStream getInputStream() throws IOException {
        return this.request.getInputStream();
    }

    public String getProtocol() {
        return this.request.getProtocol();
    }

    public String getScheme() {
        return this.request.getScheme();
    }

    public String getServerName() {
        return this.request.getServerName();
    }

    public int getServerPort() {
        return this.request.getServerPort();
    }

    public BufferedReader getReader() throws IOException {
        return this.request.getReader();
    }

    public String getRemoteAddr() {
        return this.request.getRemoteAddr();
    }

    public String getRemoteHost() {
        return this.request.getRemoteAddr();
    }

    public void setAttribute(String name, Object o) {
        this.request.setAttribute(name, o);
    }

    public void removeAttribute(String name) {
        this.request.removeAttribute(name);
    }

    public Locale getLocale() {
        return this.request.getLocale();
    }

    public Enumeration<Locale> getLocales() {
        return this.request.getLocales();
    }

    public boolean isSecure() {
        return this.request.isSecure();
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        return this.request.getRequestDispatcher(path);
    }

    public String getRealPath(String path) {
        return this.request.getRealPath(path);
    }

    public int getRemotePort() {
        return this.request.getRemotePort();
    }

    public String getLocalName() {
        return this.request.getLocalName();
    }

    public String getLocalAddr() {
        return this.request.getLocalAddr();
    }

    public int getLocalPort() {
        return this.request.getLocalPort();
    }

    public ServletContext getServletContext() {
        return this.request.getServletContext();
    }

    public AsyncContext startAsync() throws IllegalStateException {
        return this.request.startAsync();
    }

    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
        return this.request.startAsync(servletRequest, servletResponse);
    }

    public boolean isAsyncStarted() {
        return this.request.isAsyncStarted();
    }

    public boolean isAsyncSupported() {
        return this.request.isAsyncSupported();
    }

    public AsyncContext getAsyncContext() {
        return this.request.getAsyncContext();
    }

    public DispatcherType getDispatcherType() {
        return this.request.getDispatcherType();
    }

    public String getAuthType() {
        return this.request.getAuthType();
    }

    public Cookie[] getCookies() {
        return this.request.getCookies();
    }

    public long getDateHeader(String name) {
        return this.request.getDateHeader(name);
    }

    public String getHeader(String name) {
        return this.request.getHeader(name);
    }

    public Enumeration<String> getHeaders(String name) {
        return this.request.getHeaders(name);
    }

    public Enumeration<String> getHeaderNames() {
        return this.request.getHeaderNames();
    }

    public int getIntHeader(String name) {
        return this.request.getIntHeader(name);
    }

    public String getMethod() {
        return this.request.getMethod();
    }

    public String getPathInfo() {
        return this.request.getPathInfo();
    }

    public String getPathTranslated() {
        return this.request.getPathTranslated();
    }

    public String getContextPath() {
        return this.request.getContextPath();
    }

    public String getQueryString() {
        return this.request.getQueryString();
    }

    public String getRemoteUser() {
        return this.request.getRemoteUser();
    }

    public boolean isUserInRole(String role) {
        return this.request.isUserInRole(role);
    }

    public Principal getUserPrincipal() {
        return this.request.getUserPrincipal();
    }

    public String getRequestedSessionId() {
        return this.request.getRequestedSessionId();
    }

    public String getRequestURI() {
        return this.request.getRequestURI();
    }

    public StringBuffer getRequestURL() {
        return this.request.getRequestURL();
    }

    public String getServletPath() {
        return this.request.getServletPath();
    }

    public HttpSession getSession(boolean create) {
        return this.request.getSession(create);
    }

    public HttpSession getSession() {
        return this.request.getSession();
    }

    public boolean isRequestedSessionIdValid() {
        return this.request.isRequestedSessionIdValid();
    }

    public boolean isRequestedSessionIdFromCookie() {
        return this.request.isRequestedSessionIdFromCookie();
    }

    public boolean isRequestedSessionIdFromURL() {
        return this.request.isRequestedSessionIdFromURL();
    }

    public boolean isRequestedSessionIdFromUrl() {
        return this.request.isRequestedSessionIdFromUrl();
    }

    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
        return this.request.authenticate(response);
    }

    public void login(String username, String password) throws ServletException {
        this.request.login(username, password);
    }

    public void logout() throws ServletException {
        this.request.logout();
    }

    public Collection<Part> getParts() throws IOException, ServletException {
        return this.request.getParts();
    }

    public Part getPart(String name) throws IOException, ServletException {
        return this.request.getPart(name);
    }
}
