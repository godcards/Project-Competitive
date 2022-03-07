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
    List<String> SelectAllStudio();

    @Insert("insert into studio(studio_name) values(#{studioName})")
    int InsertStudio(Studio studio);

    @Update("update task set studio_name = #{studioName} where studio_id = #{studioId}")
    int UpdateStudio(int studioId);
}
