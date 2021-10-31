package com.hm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hm.domain.User;
import com.hm.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HmSpringbootday0301springbootJpaApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws JsonProcessingException {
        //1、从redis获取数据，数据形式为json字符串
        String userListJson = redisTemplate.boundValueOps("com.com.user.findAll").get();
        //2、判断redis中是否存在这个数据
        if(null == userListJson){
            //3、不存在数据，从数据库查询
            List<User> all = userRepository.findAll();
            //4、将查询出的数据存储到redis缓存中
            //4.1、将user的list集合，转换为json格式字符串，使用jackson的方式
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("com.com.user.findAll").set(userListJson);

            System.out.println("====从数据库中查询！获得user的数据====");

        }else {
            //4、存在数据，就直接返回，打印
            //5、从缓存中查询数据
            System.out.println("======从缓存中查询数据！=============");
        }
        System.out.println(userListJson);

    }

}
