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

    public List<Dayliy> selAlldayliy(){
        return dayliyMapper.selAlldayliy();
    }

    public List<Dayliy> seldayliyByName(int dayId,String dayName){
        return dayliyMapper.seldayliyByName(dayId,dayName);
    }

    public int intDayId(Dayliy dayliy){
        return dayliyMapper.intDayId(dayliy);
    }

    public int upDayName(Dayliy dayliy){
        return dayliyMapper.updDayName(dayliy);
    }

}
