package com.weyao.web.quote.resp;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.weyao.common.JsonHelper;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Response {
	public final static String SUCCESS;
	public final static String FAILURE;
	
	static {
		SUCCESS = JsonHelper.toJson(new Response(Ret.SUCC));
		FAILURE = JsonHelper.toJson(new Response(Ret.UNKOWN_ERROR));
	}
	
	public Ret ret ;
	public String data;

	public Response(){}
	
	public Response(Ret ret){
		this.ret = ret;
		this.data = "";
	}

	public Response(Ret ret,String data){
		this.ret = ret;
		this.data = data;
	}
}
