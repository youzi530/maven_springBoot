package com.user.service;

import com.user.mapper.UserMapper;
import com.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author lingqiao
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper; //此处没问题，idea误导

    public User queryUserByid(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> queryUsers(){
        return this.userMapper.selectAll();
    }

    @Transactional
    public void deleteUserById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }
}
