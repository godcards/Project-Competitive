package com.competitive.dao;

import com.competitive.pojo.Dayliy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DayliyMapper {

    @Select("select * from dayliy")
    public List<Dayliy> selAlldayliy();

    @Select("select * from dayliy where day_id=#{dayId} and day_name=#{dayName}")
    public List<Dayliy> seldayliyByName(int dayId,String dayName);

    @Insert("insert into dayliy(day_text,day_name,create_time) values(#{day_text},#{day_name},#{create_time})")
    public int intDayId(Dayliy dayliy);

    @Update("update dayliy set day_text = #{day_text},update_time = #{update_time}")
    public int updDayName(Dayliy dayliy);
}
