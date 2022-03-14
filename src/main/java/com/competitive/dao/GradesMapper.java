package com.competitive.dao;

import com.competitive.pojo.Grades;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GradesMapper {

    @Select("select * from grades")
    List<Grades> SelectAllGrades();

    @Select("select * from grades where grades_name=#{gradesName}")
    Grades SelectGradesByName(String gradesName);

    @Insert("insert into grades(chinese,math,english,java,python,grades_name) values(#{chinese},#{math},#{english},#{java},#{python},#{gradesName})")
    int InsertGrades(Grades grades);

    @Update("update grades set chinese=#{chinese},math=#{math},english=#{english},java=#{java},python=#{python} where grades_name=#{gradesName}")
    int UpdateGrades(Grades grades);

}
