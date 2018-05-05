package com.gsyun.springboot.controller;

import com.gsyun.springboot.pojo.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Demo class
 *
 * @author gongshiyun
 * @date: 2018/5/5 16:01
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public Object getUser(){
        short age = 10;
        User user = new User("liming",age,new Date(),"1111","liming","123");
        return user;
    }
}
