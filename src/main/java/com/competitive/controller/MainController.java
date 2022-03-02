package com.competitive.controller;

import com.competitive.dao.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    TaskMapper taskMapper;

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/rb")
    public String ribao(String authorId){
        taskMapper.selTaskById(authorId);
        return null;
    }

}
