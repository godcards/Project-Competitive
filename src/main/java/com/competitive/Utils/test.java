package com.competitive.Utils;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        week w=new week();
        w.getweakday(2020,10,1);
        Finish f=new Finish();
        f.fin(80);
    }
}
class week{
    public void getweakday(int year,int month,int date){
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month,date);
        int week=calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
    }
}
class Finish{
    public void fin(int finishDay){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,finishDay);
        int i = calendar.get(Calendar.YEAR);
        int i1 = calendar.get(Calendar.MONTH);
        int i2 = calendar.get(Calendar.DATE);
        System.out.println(i+" "+i1+" "+i2);
    }
}

