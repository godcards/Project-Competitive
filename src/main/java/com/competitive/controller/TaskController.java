package com.competitive.controller;

import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    TaskMapper taskMapper;

    @RequestMapping("/mysql")
    @ResponseBody
    public Task selTaskById(String authorId){
        return taskMapper.selTaskById(authorId);
    }

    @RequestMapping("/insertt")
    @ResponseBody
    public int insTask(Task task){
        return taskMapper.insTask(task);
    }

    @RequestMapping("/upd")
    @ResponseBody
    public int updTask(Task task){
        return taskMapper.updTask(task);
    }


}
