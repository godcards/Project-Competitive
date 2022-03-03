package com.competitive.dao;

import com.competitive.pojo.Dayliy;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DayliyMapper {

    @Select("select * from dayliy")
    List<Dayliy> selAllDay();

    @Select("select * from dayliy where day_name=#{dayName} order by day_id asc")
    List<Dayliy> selDayByName(String dayName);

    @Insert("insert into dayliy(day_text,day_name,create_time) values(#{day_text},#{day_name},#{create_time})")
    int intDayId(Dayliy dayliy);

    @Update("update dayliy set day_text = #{day_text},update_time = #{update_time}")
    int updDayName(Dayliy dayliy);

    @Delete("delete from dayliy where day_id=#{dayId} and day_Name=#{dayName}")
    int delDayName(String dayName,int dayId);
}
