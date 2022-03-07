package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudioController {

    @Autowired
    StudioMapper studioMapper;

    //查询所有工作室
    @RequestMapping("/studio/allStudio")
    public List<String> SelectAllStudio(){
        return studioMapper.SelectAllStudio();
    }

    //添加工作室
    @RequestMapping("/studio/insert")
    public int InsertStudio(Studio studio){
        return studioMapper.InsertStudio(studio);
    }

    //更新工作室
    @RequestMapping("/studio/update")
    public int UpdateStudio(int studioId){
        return studioMapper.UpdateStudio(studioId);
    }
}
