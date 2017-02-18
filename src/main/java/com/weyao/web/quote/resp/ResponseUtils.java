package com.weyao.web.quote.resp;

import com.weyao.common.JsonHelper;

public class ResponseUtils {
	public static Response succ(Object obj){
		if(obj instanceof String){
			return new Response(Ret.SUCC, (String)obj);
		}else{
			return new Response(Ret.SUCC,JsonHelper.toJson(obj));
		}
	}
	
	public static Response instance(int status,Object obj){
		if(obj instanceof String){
			return new Response(new Ret(status), (String)obj);
		}else{
			return new Response(new Ret(status),JsonHelper.toJson(obj)); 
		}
		
	}
	
	public static Response instance(int status,String msg){
		return new Response(new Ret(status,msg));
	}	
	
	public static Response instance(int status,String msg,Object obj){
		if(obj instanceof String){
			return new Response(new Ret(status,msg), (String)obj);
		}else{
			return new Response(new Ret(status,msg),obj != null ? JsonHelper.toJson(obj) : null);
		}
	}	
	
}
