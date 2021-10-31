package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("com.com.user")
public class UserController {

    @GetMapping("show")
    @ResponseBody
    public String test(){
        return "userController";
    }
}
