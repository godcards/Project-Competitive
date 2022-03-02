package com.competitive.service;


import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskservice {
    @Autowired
    TaskMapper taskMapper;

    public Task selTaskById(String authorId){
        return taskMapper.selTaskById(authorId);
    }

    public Task selplanByTask(String taskTitle){
        return taskMapper.selplanByTask(taskTitle);
    }

    public int insTask(Task task){
        return taskMapper.insTask(task);
    }

    public int updTask(Task task){
        return taskMapper.updTask(task);
    }

    public int delTask(int taskId){
        return taskMapper.delTask(taskId);
    }
}
