package com.godmn.framework.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.godmn.framework.exception.CodeMsgDef;
import com.godmn.framework.exception.SrvException;
import com.godmn.framework.resp.ResponseUtils;
import com.godmn.framework.resp.Ret;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController{
	private static final Log logger = LogFactory.getLog(BaseController.class);

	@ExceptionHandler({ RuntimeException.class, Exception.class })
	@ResponseBody
	public Object runtimeExceptionHandler(Exception exception, HttpServletRequest request, HttpServletResponse response) {
		logger.error(exception.getMessage(), exception);
		if (exception instanceof SrvException) {
			return ResponseUtils.instance((SrvException) exception);
		} else {
			return ResponseUtils.instance(CodeMsgDef.系统错误);
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
		return ResponseUtils.instance(e);
	}
}
