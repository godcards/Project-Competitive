package com.competitive.dao;

import com.competitive.pojo.UserTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserTaskMapping {

    //查询用户根据id
    @Select("select task_id from usertask where user_id=#{userId}")
    UserTask SelectUserTaskById(int userId);
}
