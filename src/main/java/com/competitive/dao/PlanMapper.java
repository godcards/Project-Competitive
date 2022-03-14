package com.competitive.dao;

import com.competitive.pojo.Plan;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PlanMapper {

    //查询计划根据标题名
    @Select("select * from plan where plan_title=#{planTitle}")
    Plan SelectPlanByTitle(String planTitle);

    //查询所有计划
    @Select("select * from plan")
    List<Plan> SelectAllPlan();

    //添加计划
    @Insert("insert into plan(plan_authorid,plan_detial,plan_title,type,create_time) " +
            "values(#{planAuthorid},#{planDetial},#{planTitle},#{type},#{createTime})")
    int InsertPlan(Plan plan);

    //删除计划
    @Delete("delete from plan where plan_id=#{planId}")
    int DeletePlan(int planId);

    //更改计划
    @Update("update plan set plan_detial=#{planDetial},plan_title=#{planTitle},update_time=#{updateTime},type=#{type},plan_authorid=#{planAuthorid} where plan_id=#{planId}")
    int UpdatePlan(Plan plan);
}
