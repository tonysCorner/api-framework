package com.weyao.web.quote.resp;

import org.codehaus.jackson.map.annotate.JsonSerialize;


@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Ret {
	public static final Ret SUCC = new Ret(0);
	public static final Ret ERROR_AUTH = new Ret(11,"会话失效");
	
	public static final Ret SERVICE_ERROR = new Ret(997,"Service error!");
	public static final Ret EXCEPTION_ERROR = new Ret(998,"系统异常错误!");
	public static final Ret UNKOWN_ERROR = new Ret(999,"服务器繁忙, 请稍后再试!");
	public static final Ret NOT_LOGIN = new Ret(35,"Session过期或已经退出登陆");
	public static final Ret 同一IP请求验证码一分钟超过10次 = new Ret(31,"同一IP请求验证码一分钟超过10次!");
	
	public static final Ret 同一手机号一分钟不能超过10次 = new Ret(311,"操作频繁,请您一分钟后再试!");
	public static final Ret 同一手机号一天不能超过100次 = new Ret(312,"操作频繁,请您一天后再试!");
	
	public static final Ret 授权失败 = new Ret(2500, "微信授权失败");

	public static final Ret 密码错误 = new Ret(100, "密码错误");
	public static final Ret 用户不存在 = new Ret(101, "用户不存在");

	public int code;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String msg;
	
	public Ret(){}
	
	public Ret(int code){
		this.code = code;
		this.msg = "";
	}
	
	public Ret(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	
}
