package com.competitive.dao;

import com.competitive.pojo.Plan;
import com.competitive.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlanMapper {
    @Select("select * from plan where plan_title=#{plan_title}")
    Plan selplanByTitle(String planTitle);

    @Select("select * from plan")
    List<Plan> selAllplan();

    @Insert("insert into plan(plan_authorid,plan_detial,plan_title,type) values(#{plan_authorid},#{plan_detial},#{plan_title},#{type})")
    int insplan(Plan plan);
}
