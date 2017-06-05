package com.jin.auth.dao;

import com.jin.auth.entity.Role;

import java.util.List;

/**
 * Created by jinyao on 2017/6/5.
 */
public interface RoleDao {

    List<Role> findByUsername(String userName);

}
