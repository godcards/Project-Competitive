package com.competitive.controller;

import com.competitive.dao.DayliyMapper;
import com.competitive.pojo.Dayliy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//25778
@RestController
public class daybaoController {
    @Autowired
    DayliyMapper dayliyMapper;
    //查询所有日报
    @RequestMapping("selallday")
    public List<Dayliy> selAlldayliy(Dayliy dayliy){
        return dayliyMapper.selAllDay();
    }
    //查询你自己的日报根据name来查询
    @RequestMapping("selnameday")
    public List<Dayliy> seldayliyByName(String dayName){
        return dayliyMapper.selDayByName(dayName);
    }
    //添加日报
    @RequestMapping("insdayid")
    public int intDayId(Dayliy dayliy){
        return dayliyMapper.intDayId(dayliy);
    }
    //修改日报
    @RequestMapping("upday")
    public int upDayName(Dayliy dayliy){
        return dayliyMapper.updDayName(dayliy);
    }
    //删除日报根据name和id
    @RequestMapping("delday")
    public int dalday(String dayName,int dayId){
        return dayliyMapper.delDayName(dayName,dayId);
    }

}
