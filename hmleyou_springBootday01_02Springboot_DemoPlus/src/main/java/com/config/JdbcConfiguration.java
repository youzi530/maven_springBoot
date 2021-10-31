package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author lingqiao
 * @Date 2020/6/26
 * @Version 1.0
 * @Description
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)  //启动JdbcProperties中的@ConfigurationProperties(prefix = "jdbc")
public class JdbcConfiguration {

    @Autowired
    private JdbcProperties jdbcProperties;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
}
