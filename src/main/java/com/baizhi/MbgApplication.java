package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
//通用mapper注解
@tk.mybatis.spring.annotation.MapperScan("com.baizhi.dao")
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class MbgApplication {
    public static void main(String[] args) {
        SpringApplication.run(MbgApplication.class,args);
    }
}

