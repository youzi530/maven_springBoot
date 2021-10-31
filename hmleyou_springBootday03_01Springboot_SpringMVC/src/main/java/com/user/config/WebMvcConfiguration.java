package com.user.config;

import com.user.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description 配置拦截器：1、声明该类为java配置类  2、实现WebMvcConfigurer接口
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    /**
     * @param registry 拦截器注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");//拦截所有多级目录
        //registry.addInterceptor(myInterceptor).addPathPatterns("/*");//拦截一级目录
    }
}
