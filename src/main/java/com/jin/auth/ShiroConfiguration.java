package com.jin.auth;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jinyao on 2017/6/4.
 */
@Configuration
public class ShiroConfiguration {

    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap();
        filterChainDefinitionMap.put("/logout", "logout"); //退出登录的url
        filterChainDefinitionMap.put("/base/**", "anon");//anon 可以理解为不拦截
        filterChainDefinitionMap.put("/css/**", "anon");//anon 可以理解为不拦截
        filterChainDefinitionMap.put("/layer/**", "anon");//anon 可以理解为不拦截
        filterChainDefinitionMap.put("/**", "authc");//必须授权的url
        shiroFilterFactoryBean.setLoginUrl("/login");//登录的url
        shiroFilterFactoryBean.setSuccessUrl("/index");//登录后的主页
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");//为授权url
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    @Bean
    public ShiroRealm myShiroRealm() {
        ShiroRealm myShiroRealm = new ShiroRealm();
        return myShiroRealm;
    }

}
