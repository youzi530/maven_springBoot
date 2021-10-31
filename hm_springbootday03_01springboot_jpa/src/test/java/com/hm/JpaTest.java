package com.hm;

import com.hm.domain.User;
import com.hm.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;
import java.util.List;

/**
 * @author lq
 * @date 2020/5/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HmSpringbootday0301springbootJpaApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}
