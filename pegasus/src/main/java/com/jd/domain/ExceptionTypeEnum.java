package com.jd.domain;

/**
 * Created by liuxuchao1 on 2017/10/26.
 */
public enum ExceptionTypeEnum {
    clientIllArgument("0400","请求参数错误:s%"),
    clientResourceNotFind("0404","未找到请求的资源"),

    serverDbUpdateError("500","数据库更新异常"),

    illegalState("0120","数据状态错误");

    private String code;
    private String message;
    ExceptionTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ExceptionTypeEnum{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
