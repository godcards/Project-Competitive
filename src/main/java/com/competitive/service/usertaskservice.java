package com.competitive.service;

import com.competitive.dao.UserMapper;
import com.competitive.dao.UserTaskMapping;
import com.competitive.pojo.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usertaskservice {

    @Autowired
    UserTaskMapping userTaskMapper;

    public UserTask selUserId(int userId){
        return userTaskMapper.selUserId(userId);
    }
}
