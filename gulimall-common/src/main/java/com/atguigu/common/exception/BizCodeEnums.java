package com.atguigu.common.exception;

public enum BizCodeEnums {

    UNKNOWN_EXCEPTION(10000,"系统未知异常"),
    VALID_EXCEPTION(10001,"参数格式异常");

    private Integer code;
    private String msg;
    BizCodeEnums(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
