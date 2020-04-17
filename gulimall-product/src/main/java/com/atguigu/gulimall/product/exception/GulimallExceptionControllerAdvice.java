package com.atguigu.gulimall.product.exception;

import com.atguigu.common.exception.BizCodeEnums;
import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验异常：{},异常信息类型：{}",e.getMessage(),e.getClass());
        HashMap<String, String> map = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach( item -> map.put(item.getField(),item.getDefaultMessage()));
        return R.error(BizCodeEnums.VALID_EXCEPTION.getCode(),BizCodeEnums.VALID_EXCEPTION.getMsg()).put("data",map);
    }
    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        return R.error(BizCodeEnums.UNKNOWN_EXCEPTION.getCode(),BizCodeEnums.UNKNOWN_EXCEPTION.getMsg());
    }
}
