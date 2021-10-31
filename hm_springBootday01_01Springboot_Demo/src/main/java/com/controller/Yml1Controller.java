package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Yml1Controller {

    @Value("${name}")
    private String name;

    @Value("{person.addr}")
    private String addr;

    @RequestMapping("/yml1Test")
    @ResponseBody
    public String ymlTest(){
        //获取配置文件的信息
        System.out.println(name);
        return "name:"+name;
    }
}
