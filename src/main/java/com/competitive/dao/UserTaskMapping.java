package com.competitive.dao;

import com.competitive.pojo.UserTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface UserTaskMapping {
    @Select("select task_id from usertask where user_id=#{userId}")
    UserTask selUserId(int userId);
}
