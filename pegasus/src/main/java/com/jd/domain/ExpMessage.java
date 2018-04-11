package com.jd.domain;

import java.io.Serializable;

/**
 * Created by liuxuchao1 on 2017/10/26.
 */
public class ExpMessage implements Serializable {
    /**
     * 错误码
     */
    private String code;
    /**
     * 异常信息
     */
    private String message;

    public ExpMessage() {
    }

    public ExpMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
