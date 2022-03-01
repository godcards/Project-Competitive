package com.competitive.service;


import com.competitive.dao.PlanMapper;
import com.competitive.dao.TaskMapper;
import com.competitive.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class planservice {

    @Autowired
    PlanMapper planMapper;

    public Plan selplanByTitle(String planTitle){
        return planMapper.selplanByTitle(planTitle);
    }

    public List<Plan> selAllplan(){
        return planMapper.selAllplan();
    }

    public int insplan(Plan plan){
        return planMapper.insplan(plan);
    }

}
