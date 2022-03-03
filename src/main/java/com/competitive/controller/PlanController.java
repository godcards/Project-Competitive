package com.competitive.controller;


import com.competitive.dao.PlanMapper;
import com.competitive.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    PlanMapper planMapper;

    //查询计划根据标题名
    @RequestMapping("/selPlanByTitle")
    public Plan selplanByTitle(String planTitle){
        return planMapper.selplanByTitle(planTitle);
    }

    //查询所有计划
    @RequestMapping("/selAllPlan")
    public List<Plan> selAllplan(){
        return planMapper.selAllplan();
    }

}
