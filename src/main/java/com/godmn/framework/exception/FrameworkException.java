package com.godmn.framework.exception;

/**
 * 每个服务定义自己的SrvExceptoin 封闭 serviceId 方便 使用
 */
public class FrameworkException extends SrvException {
	private static final long serialVersionUID = 1225387877203198540L;
	/**
	 * 以后要从配置文件中取，每台机器不一样，方便错误追踪
	 *
	 */
	private static int serviceId = Services.ACTIVITY;

	public FrameworkException() {
		super();
	}

	public FrameworkException(CodeMsg cm) {
		super(serviceId, cm.getCode(), cm.getMsg());
	}

	public FrameworkException(CodeMsg cm, Exception e) {
		super(serviceId, cm.getCode(), cm.getMsg(), e);
	}
}
