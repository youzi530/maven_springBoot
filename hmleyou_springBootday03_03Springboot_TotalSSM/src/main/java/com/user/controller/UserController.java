package com.user.controller;

import com.user.pojo.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("com.user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        return this.userService.queryUserByid(id);
    }

    @GetMapping("show")
    @ResponseBody
    public String test(){
        return "userController";
    }


}
