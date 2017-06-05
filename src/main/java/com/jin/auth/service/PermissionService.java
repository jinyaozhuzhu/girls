package com.jin.auth.service;

import com.jin.auth.dao.PermissionDao;
import com.jin.auth.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyao on 2017/6/5.
 */
@Service
public class PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    public List<Permission> findByRoleId(long roleId) {
        return permissionDao.findByRoleId(roleId);
    }

}
