package com.jd.domain;

import java.io.Serializable;

/**
 * Created by liuxuchao1 on 2017/10/26.
 */
public class BaseResponse<T> implements Serializable {
    /**
     * 操作人
     */
    protected String success;
    /**
     * 操作时间
     */
    protected String code;

    /**
     *
     */
    protected String message;

    /**
     * 返回值内容
     */
    protected T data;
    /**
     * 错误信息
     */
    protected ExpMessage errors;

    public BaseResponse() {
    }

    public BaseResponse(ExpMessage error) {


        this.errors = error;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
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

    public ExpMessage getErrors() {
        return errors;
    }

    public void setErrors(ExpMessage errors) {
        this.errors = errors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "success='" + success + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", errors=" + (getErrors() == null ? "null" : getErrors().toString()) + '\'' +
                '}';
    }

}
