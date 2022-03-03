package com.competitive.controller;

import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskMapper taskMapper;

    //查询任务根据作者的名字  你发布的任务 去获取当前的用户Id
    @RequestMapping("/task/selByTitle")
    public List<Task> selTaskBytitle(String taskTitle, HttpSession session){
        return taskMapper.selTaskBytitle(taskTitle);
    }

    //查询任务根据标题
    @RequestMapping("/task/selById")
    public List<Task> selTaskById(String authorId){
        return taskMapper.selTaskById(authorId);
    }

    //添加任务
    @RequestMapping("/task/Insert")
    public int insTask(Task task){
        return taskMapper.insTask(task);
    }

    //更改任务
    @RequestMapping("/task/Update")
    public int updTask(Task task){
        return taskMapper.updTask(task);
    }

    //删除任务
    @RequestMapping("/task/Delete")
    public int del(int taskId){
        return taskMapper.delTask(taskId);
    }

}
