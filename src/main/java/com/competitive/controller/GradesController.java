package com.competitive.controller;

import com.competitive.pojo.Grades;
import com.competitive.service.Gradesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradesController {

    @Autowired
    Gradesservice gradesservice;

    @RequestMapping("/grades/selectAll")
    public List<Grades> SelectAllGrades(){
        return gradesservice.SelectAllGrades();
    }

    @RequestMapping("/grades/selectByName")
    public Grades SelectGradesByName(String gradesName){
        return gradesservice.SelectGradesByName(gradesName);
    }

    @RequestMapping("/grades/insert")
    public Map<String,String> InsertGrades(int chinese,int math,int python,int java,int english,String gradesName){
        Grades grades=new Grades();
        grades.setGradesName(gradesName);
        grades.setChinese(chinese);
        grades.setEnglish(english);
        grades.setJava(java);
        grades.setMath(math);
        grades.setPython(python);
        Map<String,String> map=new HashMap<>();
        if (gradesservice.InsertGrades(grades)==0){
            map.put("code","400");
        }else {
            map.put("code","200");
        }
        return map;
    }

    @RequestMapping("/grades/update")
    public Map<String,String> UpdateGrades(int chinese,int math,int python,int java,int english,String gradesName){
        Grades grades=new Grades();
        grades.setGradesName(gradesName);
        grades.setChinese(chinese);
        grades.setEnglish(english);
        grades.setJava(java);
        grades.setMath(math);
        grades.setPython(python);
        Map<String,String> map=new HashMap<>();
        if (gradesservice.UpdateGrades(grades)==0){
            map.put("code","400");
        }else {
            map.put("code","200");
        }
        return map;
    }

}
