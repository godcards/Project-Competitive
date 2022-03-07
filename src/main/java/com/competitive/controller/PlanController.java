package com.competitive.controller;


import com.competitive.dao.PlanMapper;
import com.competitive.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    PlanMapper planMapper;

    //查询计划根据标题名
    @RequestMapping("/plan/selectByTitle")
    public Plan SelectPlanByTitle(String planTitle){
        return planMapper.SelectPlanByTitle(planTitle);
    }

    //查询所有计划
    @RequestMapping("/plan/allplan")
    public List<Plan> SelectAllPlan(){
        return planMapper.SelectAllPlan();
    }

    //添加计划
    @RequestMapping("/plan/insert")
    public int InsertPlan(Plan plan){
        return planMapper.InsertPlan(plan);
    }

    //删除计划
    @RequestMapping("/plan/delete")
    public int DeletePlan(int planId){
        return planMapper.DeletePlan(planId);
    }

    //更改计划
    @RequestMapping("/plan/update")
    public int UpdatePlan(int planId){
        return planMapper.UpdatePlan(planId);
    }

}
