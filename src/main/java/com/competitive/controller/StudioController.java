package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import com.competitive.service.Studioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudioController {

    @Autowired
    Studioservice studioservice;

    //查询所有工作室
    @RequestMapping("/studio/allStudio")
    public List<String> SelectAllStudio(){
        return studioservice.SelectAllStudio();
    }

    //添加工作室
    @RequestMapping("/studio/insert")
    public Map<String, String> InsertStudio(String studioName, String school, String icon){
        Studio studio=new Studio();
        studio.setStudioName(studioName);
        studio.setIcon(icon);
        studio.setSchool(school);
        Map<String,String> map=new HashMap<>();
        int i = studioservice.InsertStudio(studio);
        if(i==0){
            map.put("code","400");
        }else{
            map.put("code","200");
        }
        return map;
    }

    //更新工作室
    @RequestMapping("/studio/update")
    public Map<String,String> UpdateStudio(int studioId,String studioName,String school,String icon){
        Studio studio=new Studio();
        studio.setStudioId(studioId);
        studio.setStudioName(studioName);
        studio.setIcon(icon);
        studio.setSchool(school);
        Map<String,String> map=new HashMap<>();
        int i = studioservice.UpdateStudio(studio);
        if(i==0){
            map.put("code","400");
        }else{
            map.put("code","200");
        }
        return map;
    }
}
