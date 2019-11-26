package com.teligen.datamonitor.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseData defaultErrorHandler(HttpServletRequest req,Exception e) throws  Exception{
        log.error(e.getMessage(),e);
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException){
            responseData.setCode(404);
        }else {
            responseData.setCode(500);
        }
        responseData.setData(null);
        responseData.setStatus(false);
        return  responseData;
    }
}
