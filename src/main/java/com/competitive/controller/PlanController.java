package com.competitive.controller;


import com.competitive.dao.PlanMapper;
import com.competitive.pojo.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlanController {

    @Autowired
    PlanMapper planMapper;

    @RequestMapping("")
    @ResponseBody
    public Plan selplanByTitle(String planTitle){
        Plan plan = planMapper.selplanByTitle(planTitle);
        return plan;
    }

    @RequestMapping("")
    @ResponseBody
    public List<Plan> selAllplan(){
        List<Plan> plans = planMapper.selAllplan();
        return plans;
    }

}
