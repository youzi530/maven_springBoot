package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("hello1")
public class HelloWord1Controller {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("show")
    public void test(){
        System.out.println("测试1~");
    }
}
