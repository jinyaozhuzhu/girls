package com.jin.auth.service;

import com.jin.auth.dao.UserDao;
import com.jin.auth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jinyao on 2017/6/5.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}
