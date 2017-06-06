package com.jin.auth.dao;

import com.jin.auth.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by jinyao on 2017/6/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {


    private final static Logger LOGGER = LoggerFactory.getLogger(RoleDaoTest.class);

    @Autowired
    private RoleDao roleDao;

    @Test
    public void findByUsername() throws Exception {
        List<Role> roles = roleDao.findByUsername("111");
        LOGGER.info("role = {}", roles);
    }

}