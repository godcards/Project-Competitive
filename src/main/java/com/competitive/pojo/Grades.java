package com.competitive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grades {
   private int chinese;
   private int math;
   private int english;
   private int java;
   private int python;
   private String gradesName;
}
