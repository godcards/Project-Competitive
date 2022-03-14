package com.competitive.service;


import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Taskservice {
    @Autowired
    TaskMapper taskMapper;

    //查询任务根据标题
    public List<Task> selTaskById(String authorId){
        return taskMapper.selTaskById(authorId);
    }

    //查询任务根据作者的名字
    public List<Task> selTaskBytitle(String taskTitle){
        return taskMapper.selTaskBytitle(taskTitle);
    }

    //添加任务
    public int insTask(Task task){
        return taskMapper.insTask(task);
    }

    //更改任务
    public int updTask(Task task){
        return taskMapper.updTask(task);
    }

    //删除任务
    public int delTask(int taskId){
        return taskMapper.delTask(taskId);
    }
}
