package com.jin.auth.service;

import com.jin.auth.dao.RoleDao;
import com.jin.auth.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyao on 2017/6/5.
 */
@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> findByUsername(String username) {
        return roleDao.findByUsername(username);
    }
}
