package com.jd.util;

import com.jd.domain.BaseResponse;
import com.jd.domain.ExceptionTypeEnum;
import com.jd.domain.ExpMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * Created by tongyuehong on 2017/7/28.
 */
public class ServiceAssist {
    private static final Logger logger = LoggerFactory.getLogger(ServiceAssist.class);

    /**
     * 成功返回值
     * @param cls
     * @param <T>
     * @return
     */
    public static <T extends BaseResponse> T ok(Class<T> cls) {
        T t;
        try {
            Constructor<T> constructor = cls.getConstructor();
            t = constructor.newInstance();
        } catch (Exception e) {
            String errorInfo = "new " + cls.getName() + " instance error";
            logger.error(errorInfo, e);
            throw new RuntimeException(errorInfo, e);
        }
        return t;
    }

    /**
     * 成功返回值
     * @param cls
     * @param <T>
     * @return
     */
    public static <T extends BaseResponse<E>,E> T ok(Class<T> cls,E body) {
        T t;
        try {
            Constructor<T> constructor = cls.getConstructor();
            t = constructor.newInstance();
            t.setData(body);
        } catch (Exception e) {
            String errorInfo = "new " + cls.getName() + " instance error";
            logger.error(errorInfo, e);
            throw new RuntimeException(errorInfo, e);
        }
        return t;
    }

    /**
     * 成功返回值
     * @param cls
     * @param <T>
     * @return
     */
    public static <T extends BaseResponse<E>,E> T ok(Class<T> cls,E body,String code,String message) {
        T t;
        try {
            Constructor<T> constructor = cls.getConstructor();
            t = constructor.newInstance();
            t.setData(body);
            t.setCode(code);
            t.setMessage(message);
        } catch (Exception e) {
            String errorInfo = "new " + cls.getName() + " instance error";
            logger.error(errorInfo, e);
            throw new RuntimeException(errorInfo, e);
        }
        return t;
    }


    /**
     * 失败返回值
     * @param cls
     * @param <T>
     * @return
     */
    public static <T extends BaseResponse> T fail(Class<T> cls,String failCode,String failMsg) {
        T t;
        try {
            Constructor<T> constructor = cls.getConstructor(ExpMessage.class);
            t = constructor.newInstance(new ExpMessage(failCode, failMsg));
        } catch (Exception e) {
            String errorInfo = "new " + cls.getName() + " instance error";
            logger.error(errorInfo, e);
            throw new RuntimeException(errorInfo, e);
        }
        return t;
    }

    public static <T extends BaseResponse<T>> BaseResponse fail(ExceptionTypeEnum exceptionTypeEnum, String failMsg) {
        BaseResponse<T> baseResponse  = new BaseResponse<T>();
        String responseMsg = String.format(exceptionTypeEnum.getMessage(),failMsg);
        baseResponse.setErrors(new ExpMessage(exceptionTypeEnum.getCode(), responseMsg));
        return baseResponse;
    }
}
