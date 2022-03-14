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
    @Select("select * from dayliy where author_id=#{authorId} order by day_id asc")
    List<Dayliy> SelectDayByName(String authorId);

    //添加日报
    @Insert("insert into dayliy(day_text,day_name,create_time,author_id) " +
            "values(#{dayText},#{dayName},#{createTime},#{authorId})")
    int InsertDayId(Dayliy dayliy);

    //修改日报
    @Update("update dayliy set day_text = #{dayText},day_name=#{dayName},update_time = #{updateTime},author_id=#{authorId} where day_id = #{dayId}")
    int UpdateDayName(Dayliy dayliy);

    //删除日报根据name
    @Delete("delete from dayliy where day_name=#{dayName}")
    int DeleteDayName(String dayName);
}
