package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description  构造方法的方式注入数据
 */
@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)  //启动JdbcProperties中的@ConfigurationProperties(prefix = "jdbc")
public class JdbcConfiguration {


    @Bean
    @ConfigurationProperties(prefix = "jdbc")  //使用@ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
