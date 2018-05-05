package com.gsyun.springboot.controller;

import com.gsyun.springboot.pojo.JsonResult;
import com.gsyun.springboot.pojo.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author gongshiyun
 * @date: 2018/5/5 15:42
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello";
    }

    @RequestMapping("/resource")
    public JsonResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);

        return JsonResult.ok(bean);
    }
}
