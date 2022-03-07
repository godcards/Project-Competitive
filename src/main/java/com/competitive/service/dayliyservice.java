package com.competitive.service;

import com.competitive.dao.DayliyMapper;
import com.competitive.pojo.Dayliy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class dayliyservice {

    @Autowired
    DayliyMapper dayliyMapper;

    //查询所有日报
    public List<Dayliy> SelectAllDay(){
        return dayliyMapper.SelectAllDay();
    }

    //查询你自己的日报根据name来查询
    public List<Dayliy> SelectDayByName(String dayName){
        return dayliyMapper.SelectDayByName(dayName);
    }

    //添加日报
    public int InsertDayId(Dayliy dayliy){
        return dayliyMapper.InsertDayId(dayliy);
    }

    //修改日报
    public int UpdateDayName(Dayliy dayliy){
        return dayliyMapper.UpdateDayName(dayliy);
    }

    //删除日报根据name和id
    public int DeleteDayName(int dayId,String dayName){
        return dayliyMapper.DeleteDayName(dayName,dayId);
    }

}
