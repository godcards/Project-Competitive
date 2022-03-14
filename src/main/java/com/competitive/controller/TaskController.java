package com.competitive.controller;

import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Task;
import com.competitive.service.Taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {

    @Autowired
    Taskservice taskservice;

    //查询任务根据标题
    @RequestMapping("/task/selByTitle")
    public List<Task> selTaskBytitle(String taskTitle, HttpSession session){
        return taskservice.selTaskBytitle(taskTitle);
    }

    //查询任务根据作者的名字  你发布的任务 去获取当前的用户Id
    @RequestMapping("/task/selById")
    public List<Task> selTaskById(String authorId){
        return taskservice.selTaskById(authorId);
    }

    //添加任务
    @PostMapping("/task/Insert")
    public Map<String,String> insTask(String taskTitle, String taskContent, String authorId){
        Task task=new Task();
        task.setTaskTitle(taskTitle);
        task.setTaskContent(taskContent);
        task.setAuthorId(authorId);
        Date date=new Date();
        task.setCreateTime(date);
        task.setStartTime(date);
        task.setEndTime(date);
        Map<String,String> map= new HashMap<>();
        if (taskservice.insTask(task)==0){
            map.put("code","400");
        }else {
            map.put("code","200");
        }
        return map;
    }

    //更改任务
    @RequestMapping("/task/Update")
    public Map<String,String> updTask(Task task){
        Date date=new Date();
        task.setUpdateTime(date);
        task.setStartTime(date);
        task.setEndTime(date);
        Map<String,String> map=new HashMap<>();
        int i = taskservice.updTask(task);
        if (i==0){
            map.put("code","400");
        }else {
            map.put("code","200");
        }
        return map;
    }

    //删除任务
    @RequestMapping("/task/Delete")
    public int del(int taskId){
        System.out.println(taskId);
        return taskservice.delTask(taskId);
    }

}