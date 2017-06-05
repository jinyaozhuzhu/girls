package com.jin.auth.dao;

import com.jin.auth.entity.User;

/**
 * Created by jinyao on 2017/6/5.
 */
public interface UserDao {

    User findUser(User user);

    User findByUsername(String username);

}
