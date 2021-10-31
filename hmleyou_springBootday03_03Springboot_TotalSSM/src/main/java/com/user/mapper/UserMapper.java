package com.user.mapper;

import com.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author lingqiao
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

}
