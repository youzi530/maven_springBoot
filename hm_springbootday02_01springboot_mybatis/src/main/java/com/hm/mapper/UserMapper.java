package com.hm.mapper;

import com.hm.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/12
 */
@Mapper
public interface UserMapper {

    public List<User> queryUserList();

}
