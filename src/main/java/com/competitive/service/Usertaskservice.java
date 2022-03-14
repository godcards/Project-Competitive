package com.competitive.service;

import com.competitive.dao.UserTaskMapping;
import com.competitive.pojo.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Usertaskservice {

    @Autowired
    UserTaskMapping userTaskMapper;

    //查询用户根据id
    public UserTask SelectUserTaskById(int userId){
        return userTaskMapper.SelectUserTaskById(userId);
    }
}
