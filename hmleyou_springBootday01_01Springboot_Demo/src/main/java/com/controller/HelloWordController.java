package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lq
 * @date 2020/6/25
 */

@RestController
@RequestMapping("hello")
@EnableAutoConfiguration //启用自动配置
public class HelloWordController {

    @GetMapping("show")
    public String test(){
        return "hello springboot";
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloWordController.class);
    }
}
