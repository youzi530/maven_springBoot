package com.user.controller;

import com.user.pojo.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        return this.userService.queryUserByid(id);
    }


    @GetMapping("all")
    public String toUsers(Model model){
        List<User> users = this.userService.queryAll();
        model.addAttribute("users",users);
        return "users";
    }


    @GetMapping("show")
    @ResponseBody
    public String test(){
        return "userController";
    }


}
