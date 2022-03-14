package com.competitive.controller;

import com.competitive.dao.DayliyMapper;
import com.competitive.pojo.Dayliy;
import com.competitive.service.Dayliyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//25778
@RestController
public class daybaoController {

    @Autowired
    Dayliyservice dayliyservice;

    //查询所有日报
    @RequestMapping("/day/allDay")
    public List<Dayliy> SelectAllDay(Dayliy dayliy){
        return dayliyservice.SelectAllDay();
    }

    //查询你自己的日报根据name来查询
    @RequestMapping("/day/dayId")
    public List<Dayliy> SelectDayByName(HttpSession session){
        String authorId = String.valueOf(session.getAttribute("name"));
        return dayliyservice.SelectDayByName(authorId);
    }

    //添加日报
    @RequestMapping("/day/insert")
    public Map<String,String> InsertDayId(String dayText, String dayName, String authorId){
        Map<String,String> map=new HashMap<>();
        Dayliy dayliy=new Dayliy();
        Date date=new Date();
        dayliy.setCreateTime(date);
        dayliy.setDayName(dayName);
        dayliy.setAuthorId(authorId);
        dayliy.setDayText(dayText);
        int i = dayliyservice.InsertDayId(dayliy);
        if (i==0){
            map.put("code","400");
        }else{
            map.put("code","200");
        }
        return map;
    }

    //修改日报
    @RequestMapping("/day/update")
    public Map<String,String> UpdateDayName(String dayText,String dayName,String authorId,int dayId){
        Map<String,String> map=new HashMap<>();
        Dayliy dayliy=new Dayliy();
        Date date=new Date();
        dayliy.setUpdateTime(date);
        dayliy.setDayName(dayName);
        dayliy.setAuthorId(authorId);
        dayliy.setDayText(dayText);
        dayliy.setDayId(dayId);
        int i = dayliyservice.UpdateDayName(dayliy);
        if (i==0){
            map.put("code","400");
        }else{
            map.put("code","200");
        }
        return map;
    }

    //删除日报根据name
    @RequestMapping("/day/delete")
    public Map<String,String> DeleteDayName(String dayName){
        Map<String,String> map=new HashMap<>();
        int i = dayliyservice.DeleteDayName(dayName);
        if (i==0){
            map.put("code","400");
        }else{
            map.put("code","200");
        }
        return map;
    }

}
