package com.godmn.framework.resp;

import com.godmn.framework.exception.CodeMsg;
import com.godmn.framework.exception.CodeMsgDef;
import com.godmn.framework.exception.SrvException;
import com.weyao.common.JsonHelper2;

public class ResponseUtils {
	private static final String CROSS_DOMAIN_UPLOAD_FILE = "<script >document.domain=\'1234ye.com\'</script>";

	public ResponseUtils() {
	}

	public static Response succ() {
		return new Response(CodeMsgDef.SUCCESS);
	}

	public static Response succ(Object obj) {
		return new Response(CodeMsgDef.SUCCESS, obj);
	}

	public static Response instance(CodeMsg ret) {
		return new Response(ret);
	}

	public static Response instance(SrvException ext) {
		return new Response(ext);
	}

	public static String succUploadFile(Object obj) {
		return "<script >document.domain=\'1234ye.com\'</script>" + JsonHelper2.toJson(new Response(CodeMsgDef.SUCCESS, obj));
	}

	public static String instanceUploadFile(CodeMsg ret) {
		return "<script >document.domain=\'1234ye.com\'</script>" + JsonHelper2.toJson(new Response(ret));
	}
}
