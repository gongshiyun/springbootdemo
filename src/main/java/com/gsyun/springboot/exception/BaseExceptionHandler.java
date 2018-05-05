package com.gsyun.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Demo class
 *
 * @author gongshiyun
 * @date: 2018/5/5 18:09
 */
@ControllerAdvice
public class BaseExceptionHandler {

    public static final String ERROR_VIEW = "error";

    @ExceptionHandler(Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        e.printStackTrace();
        ModelAndView modv = new ModelAndView();
        modv.addObject("exception",e);
        modv.addObject("url",request.getRequestURL());
        modv.setViewName(ERROR_VIEW);
        return modv;
    }
}
