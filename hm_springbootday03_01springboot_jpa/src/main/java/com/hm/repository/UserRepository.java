package com.hm.repository;

import com.hm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author lq
 * @date 2020/5/12
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> findAll();
}
