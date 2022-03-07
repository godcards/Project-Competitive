package com.competitive.dao;

import com.competitive.pojo.Dayliy;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DayliyMapper {


    //查询所有日报
    @Select("select * from dayliy")
    List<Dayliy> SelectAllDay();

    //查询你自己的日报根据name来查询
    @Select("select * from dayliy where day_name=#{dayName} order by day_id asc")
    List<Dayliy> SelectDayByName(String dayName);

    //添加日报
    @Insert("insert into dayliy(day_text,day_name,create_time) values(#{dayText},#{dayName},#{createTime})")
    int InsertDayId(Dayliy dayliy);

    //修改日报
    @Update("update dayliy set day_text = #{dayText},update_time = #{updateTime}")
    int UpdateDayName(Dayliy dayliy);

    //删除日报根据name和id
    @Delete("delete from dayliy where day_id=#{dayId} and day_name=#{dayName}")
    int DeleteDayName(String dayName,int dayId);
}
