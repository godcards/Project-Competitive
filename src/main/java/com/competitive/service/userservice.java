package com.competitive.service;

import com.competitive.dao.UserMapper;
import com.competitive.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice{

    @Autowired
    UserMapper userMapper;

    //查询用户的id根据用户名
    public int SelectUserId(String userName){
        return userMapper.SelectUserId(userName);
    }

    //查询用户所有的信息根据id
    public User SelectUserById(int userId){
        return userMapper.SelectUserById(userId);
    }

    //添加用户(注册)
    public int InsertUser(User user){
        return userMapper.InsertUser(user);
    }

    //登陆实现
    public User SelectUserNamePassWord(String userName){
        return userMapper.SelectUserNamePassWord(userName);
    }

    //更改用户的信息
    public int UpdateUser(User user){
        return userMapper.UpdateUser(user);
    }

}
