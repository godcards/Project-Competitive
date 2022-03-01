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

    @RequestMapping("/sqlt")
    @ResponseBody
    public List<Task> selAllTask(){
        List<Task> tasks = taskMapper.selAllTask();
        return tasks;
    }
    @@RequestMapping
    public Task insTask(){

    }

}
