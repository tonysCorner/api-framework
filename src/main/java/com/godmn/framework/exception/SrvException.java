package com.godmn.framework.exception;

import com.weyao.common.JsonHelper2;

public class SrvException extends Exception {

    private static final long serialVersionUID = 3162989605548935100L;

    /**
     * 在 com.weyao.exception.Services 中定义
     * 服务ID
     */
    private int serviceId;

    // 在com.weyao.exception.ErrorCodeDef 中定义
    private int code;

    // 在com.weyao.exception.ErrorDef 中定义
    private String msg;

    private Object data;

    public SrvException() {

    }

    public SrvException(int serviceId, CodeMsg cm) {

        this(serviceId, cm.getCode(), cm.getMsg(), null);
    }

    public SrvException(int serviceId, int code, String msg) {

        this(serviceId, code, msg, null);
    }

    public SrvException(int serviceId, int code, String msg, Exception e) {

        this(serviceId, code, msg, null, e);
    }

    public SrvException(int serviceId, int code, String msg, Object data) {

        this(serviceId, code, msg, data, null);
    }

    public SrvException(int serviceId, int code, String msg, Object data, Exception e) {

        super(msg, e);
        this.serviceId = serviceId;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getServiceId() {

        return serviceId;
    }

    public int getCode() {

        return code;
    }

    public String getMsg() {

        return msg;
    }

    public void setServiceId(int serviceId) {

        this.serviceId = serviceId;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public void setMsg(String msg) {

        this.msg = msg;
    }

    public Object getData() {

        return data;
    }

    public void setData(Object data) {

        this.data = data;
    }

    public String toString() {

        return "SID:" + serviceId + " Code:" + code + " Msg:" + msg + " Data:" + JsonHelper2.toJson(data);
    }
}
