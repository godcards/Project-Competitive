package com.competitive.service;

import com.competitive.dao.UserMapper;
import com.competitive.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice{

    @Autowired
    UserMapper userMapper;

    public User seluserById(int userId){
        return userMapper.seluserById(userId);
    }
    public List<User> selAlluser(){
        return userMapper.selAlluser();
    }
    public int InsUser(User user){
        return userMapper.insuser(user);
    }

}
