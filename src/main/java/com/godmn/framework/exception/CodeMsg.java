package com.godmn.framework.exception;
/**
 * 定义错误码与错误提示信息的对应关系
 * 
 * */
public class CodeMsg {

    private int code;

    private String msg;

    public CodeMsg() {

    }

    protected CodeMsg(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public int getCode() {

        return code;
    }

    protected void setCode(int code) {

        this.code = code;
    }

    public String getMsg() {

        return msg;
    }

    protected void setMsg(String msg) {

        this.msg = msg;
    }

}
