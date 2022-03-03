package com.competitive.dao;

import com.competitive.pojo.Studio;
import com.competitive.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudioMapper {

    @Select("select studio_name from studio")
    List<String> SelStudio();

    @Insert("insert into studio(studio_name) values(#{studio})")
    int InsStudio(String studioName);

    @Update("update task set update_time = #{update_time} where task_id = #{task_id}")
    int updStudio(Studio studio);
}
