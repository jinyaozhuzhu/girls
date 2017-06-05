package com.jin.auth;

import com.jin.auth.entity.Permission;
import com.jin.auth.entity.Role;
import com.jin.auth.entity.User;
import com.jin.auth.service.PermissionService;
import com.jin.auth.service.RoleService;
import com.jin.auth.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jinyao on 2017/6/4.
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user = (User) principalCollection.getPrimaryPrincipal();

        List<Role> roles = roleService.findByUsername(user.getUsername());
        //添加角色
        roles.stream().forEach(role -> authorizationInfo.addRole(role.getRole()));

        //添加权限
        roles.stream().forEach(role -> {
            List<Permission> permissions = permissionService.findByRoleId(role.getId());
            permissions.stream().forEach(permission ->
                    authorizationInfo.addStringPermission(permission.getPermission()));
        });

        return authorizationInfo;
    }

    /**
     * 身份认证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        User user = userService.findByUsername(username);
        if (user == null) {
            throw new UnknownAccountException();
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }
}
