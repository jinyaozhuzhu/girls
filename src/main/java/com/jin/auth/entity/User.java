package com.jin.auth.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jinyao on 2017/6/4.
 */

public class User implements Serializable {
    private long id;//用户id;

    private String username;//账号.

    private String name;//名称（昵称或者真实姓名，不同系统不同定义）

    private String password; //密码;
    private String salt;//加密密码的盐

    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）
    // --等待验证的用户 , 1:正常状态,2：用户被锁定.

    private List<Role> roleList;// 一个用户具有多个角色

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public long getId() {
        return id;
    }

    public void setUid(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    /**
     * 密码盐.
     *
     * @return
     */
    public String getCredentialsSalt() {
        return this.username + this.salt;
    }

    @Override
    public String toString() {
        return "UserInfo [uid=" + id + ", username=" + username + ", name=" +
                name + ", password=" + password
                + ", salt=" + salt + ", state=" + state + "]";
    }


}
