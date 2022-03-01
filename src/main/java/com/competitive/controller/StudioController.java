package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudioController {

    @Autowired
    StudioMapper studioMapper;

    @RequestMapping("/stu")
    @ResponseBody
    public List<String> SelStudio(){
        List<String> studio = studioMapper.SelStudio();
        return studio;
    }

}
