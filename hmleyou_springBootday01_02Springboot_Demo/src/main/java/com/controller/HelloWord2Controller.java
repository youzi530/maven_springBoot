package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("hello2")
public class HelloWord2Controller {

    @RequestMapping("show")
    public void test(){
        System.out.println("controller2的测试~");
    }
}
