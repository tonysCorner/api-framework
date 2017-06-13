package com.godmn.framework.resp;


import com.godmn.framework.exception.CodeMsg;
import com.godmn.framework.exception.CodeMsgDef;
import com.godmn.framework.exception.SrvException;
import com.weyao.common.JsonHelper;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@XmlRootElement
@JsonSerialize(
		include = Inclusion.NON_NULL
)
public class Response {
	public static final String SUCCESS;
	public static final String ERROR;
	private int code;
	private String msg;
	private Object data;

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Response() {
	}

	public Response(CodeMsg ret) {
		this.code = ret.getCode();
		this.msg = ret.getMsg();
		this.data = "";
	}

	public Response(CodeMsg ret, Object obj) {
		this.code = ret.getCode();
		this.msg = ret.getMsg();
		this.data = obj;
	}

	public Response(SrvException ext) {
		this.code = ext.getCode();
		this.msg = ext.getMsg();
		this.data = ext.getData();
	}

	static {
		SUCCESS = JsonHelper.toJson(new Response(CodeMsgDef.SUCCESS));
		ERROR = JsonHelper.toJson(new Response(CodeMsgDef.ERROR));
	}
}
