package com.jin.shiro.dao;

import com.jin.auth.dao.UserDao;
import com.jin.auth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jinyao on 2017/6/5.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    private final static Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void findByUsername() throws Exception {
        User user = userDao.findByUsername("111");
        logger.info("user={}", user);
    }

    @Test
    public void findUser() throws Exception {
        User user = new User();
        user.setUsername("111");
        user = userDao.findUser(user);
        logger.info("user={}", user);
    }

}