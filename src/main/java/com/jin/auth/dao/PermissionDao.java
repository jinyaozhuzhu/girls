package com.jin.auth.dao;

import com.jin.auth.entity.Permission;

import java.util.List;

/**
 * Created by jinyao on 2017/6/5.
 */
public interface PermissionDao {

    List<Permission> findByRoleId(long roleId);
}
