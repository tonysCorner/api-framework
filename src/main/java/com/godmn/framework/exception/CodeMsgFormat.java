package com.godmn.framework.exception;


public class CodeMsgFormat extends CodeMsg {

    public CodeMsg format(Object... args) {

        return new CodeMsg(super.getCode(), String.format(super.getMsg(), args));
    }

    protected CodeMsgFormat(int code, String formatter) {

        super(code, formatter);
    }
}
