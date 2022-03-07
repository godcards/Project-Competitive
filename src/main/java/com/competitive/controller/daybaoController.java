package com.competitive.controller;

import com.competitive.dao.DayliyMapper;
import com.competitive.pojo.Dayliy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//25778
@RestController
public class daybaoController {

    @Autowired
    DayliyMapper dayliyMapper;

    //查询所有日报
    @RequestMapping("/day/allDay")
    public List<Dayliy> SelectAllDay(Dayliy dayliy){
        return dayliyMapper.SelectAllDay();
    }

    //查询你自己的日报根据name来查询
    @RequestMapping("/day/dayName")
    public List<Dayliy> SelectDayByName(String dayName){
        return dayliyMapper.SelectDayByName(dayName);
    }

    //添加日报
    @RequestMapping("/day/insert")
    public int InsertDayId(Dayliy dayliy){
        return dayliyMapper.InsertDayId(dayliy);
    }

    //修改日报
    @RequestMapping("/day/update")
    public int UpdateDayName(Dayliy dayliy){
        return dayliyMapper.UpdateDayName(dayliy);
    }

    //删除日报根据name和id
    @RequestMapping("/day/delete")
    public int DeleteDayName(String dayName,int dayId){
        return dayliyMapper.DeleteDayName(dayName,dayId);
    }

}
