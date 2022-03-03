package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudioController {

    @Autowired
    StudioMapper studioMapper;

    //查询所有工作室
    @RequestMapping("/stu")
    public List<String> SelStudio(){
        return studioMapper.SelStudio();
    }
}
