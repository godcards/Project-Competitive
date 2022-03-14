package com.competitive.controller;


import com.competitive.dao.PlanMapper;
import com.competitive.pojo.Plan;
import com.competitive.service.Planservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PlanController {

    @Autowired
    Planservice planservice;

    //查询计划根据标题名
    @RequestMapping("/plan/selectByTitle")
    public Plan SelectPlanByTitle(String planTitle){
        return planservice.SelectPlanByTitle(planTitle);
    }

    //查询所有计划
    @RequestMapping("/plan/allplan")
    public List<Plan> SelectAllPlan(){
        return planservice.SelectAllPlan();
    }

    //添加计划
    @RequestMapping("/plan/insert")
    public Map<String,String> InsertPlan(String planDetail, String planTitle, String type,String planAuthorid){
        Plan plan = new Plan();
        Date date = new Date();
        plan.setCreateTime(date);
        plan.setPlanDetial(planDetail);
        plan.setPlanTitle(planTitle);
        plan.setType(type);
        plan.setPlanAuthorid(planAuthorid);
        Map<String,String> map=new HashMap<>();
        int i = planservice.InsertPlan(plan);
        if (i==0) {
            map.put("code", "400");
        }else{
            map.put("code","200");
        }
        return map;
    }

    //更改计划
    @RequestMapping("/plan/update")
    public Map<String,String> UpdatePlan(String planDetial, String planTitle, String type, int planId,String planAuthorid){
        Plan plan = new Plan();
        Date date=new Date();
        plan.setUpdateTime(date);
        plan.setPlanId(planId);
        plan.setPlanDetial(planDetial);
        plan.setPlanTitle(planTitle);
        plan.setPlanAuthorid(planAuthorid);
        plan.setType(type);
        Map<String,String> map=new HashMap<>();
        int i = planservice.UpdatePlan(plan);
        if (i==0) {
            map.put("code", "400");
        }else{
                map.put("code","200");
        }
        return map;
    }

    //删除计划
    @RequestMapping("/plan/delete")
    public Map<String, String> DeletePlan(int planId){
        Map<String,String> map=new HashMap<>();
        int i = planservice.DeletePlan(planId);
        if (i==0) {
            map.put("code", "400");
        }else{
            map.put("code","200");
        }
        return map;
    }
}
