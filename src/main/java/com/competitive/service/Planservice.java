package com.competitive.service;


import com.competitive.dao.PlanMapper;
import com.competitive.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Planservice {

    @Autowired
    PlanMapper planMapper;

    //查询计划根据标题名
    public Plan SelectPlanByTitle(String planTitle){
        return planMapper.SelectPlanByTitle(planTitle);
    }

    //查询所有计划
    public List<Plan> SelectAllPlan(){
        return planMapper.SelectAllPlan();
    }

    //添加计划
    public int InsertPlan(Plan plan){
        return planMapper.InsertPlan(plan);
    }

    //删除计划
    public int DeletePlan(int planId){
        return planMapper.DeletePlan(planId);
    }

    //更改计划
    public int UpdatePlan(Plan plan){
        return planMapper.UpdatePlan(plan);
    }

}
