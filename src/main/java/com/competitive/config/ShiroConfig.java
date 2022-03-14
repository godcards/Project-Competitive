package com.competitive.config;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("manager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(defaultWebSecurityManager);
        //添加内置过滤器

        Map<String, String> filterMap = new LinkedHashMap<String,String>();
//        filterMap.put("/user/*","authc");
//        //教师可以干的
//        filterMap.put("/task/Insert","role[teacher]");
//        filterMap.put("/task/Update","role[teacher]");
//        filterMap.put("/task/Delete","role[teacher]");
        //学生可以干的
        filterMap.put("/user/upduser","authc");
        filterMap.put("/user/selId","authc");
        filterMap.put("/day/*","authc");
        filterMap.put("/plan/*","authc");
        filterMap.put("/task/*","authc");
        filterMap.put("/studio/*","authc");
        filterMap.put("/main","authc");
        filterMap.put("/grades/*","authc");

        bean.setFilterChainDefinitionMap(filterMap);

        bean.setLoginUrl("/NotLogged");

        return bean;
    }

    @Bean(name="manager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }

}
