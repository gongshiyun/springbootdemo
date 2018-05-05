package com.gsyun.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * Demo class
 *
 * @author gongshiyun
 * @date: 2018/5/5 15:44
 */
public class User {

    private String name;

    private short age;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale="zh",timezone = "GMT+8")
    private Date birthday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

    private String account;

    @JsonIgnore
    private String password;

    public User(String name, short age, Date birthday, String desc, String account, String password) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.desc = desc;
        this.account = account;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
