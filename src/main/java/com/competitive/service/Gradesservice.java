package com.competitive.service;

import com.competitive.dao.GradesMapper;
import com.competitive.pojo.Grades;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Gradesservice {
    @Autowired
    GradesMapper gradesMapper;

    public List<Grades> SelectAllGrades(){
        return gradesMapper.SelectAllGrades();
    }

    public Grades SelectGradesByName(String gradesName){
        return gradesMapper.SelectGradesByName(gradesName);
    }

    public int InsertGrades(Grades grades){
        return gradesMapper.InsertGrades(grades);
    }

    public int UpdateGrades(Grades grades){
        return gradesMapper.UpdateGrades(grades);
    }

}
