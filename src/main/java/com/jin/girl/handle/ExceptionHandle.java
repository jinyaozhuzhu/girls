package com.jin.girl.handle;

import com.jin.girl.entity.Result;
import com.jin.girl.exception.GirlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jinyao on 2017/3/14.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * ExceptionHandler 申明要捕获的异常类 当异常发生时会调用此方法
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return new Result(girlException.getCode(), e.getMessage(), null);
        } else {
            logger.error("[系统异常]", e);
            return new Result(-1, "未知错误", null);
        }

    }
}
