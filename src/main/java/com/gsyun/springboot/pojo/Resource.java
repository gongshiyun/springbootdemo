package com.gsyun.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用资源文件中的属性默认配置类的属性值
 *
 * @author gongshiyun
 * @date: 2018/5/5 16:48
 */
@Configuration
@ConfigurationProperties(prefix = "com.gsyun.user")
@PropertySource(value="classpath:resource.properties")
public class Resource {
    private String name;
    private short age;
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
