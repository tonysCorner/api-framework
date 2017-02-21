package com.godmn.framework.exception;


/**
 * 错误级别最高的SrvException
 * */
public class ErrorSrvException extends SrvException {
	private static final long serialVersionUID = -1313562990144781950L;

	public ErrorSrvException(com.weyao.exception.SrvException e){
		super(e.getServiceId(),e.getCode(),e.getMsg());
	}

	public ErrorSrvException(SrvException e, Exception ex){
		super(e.getServiceId(),e.getCode(),e.getMsg(),ex);
	}
}
