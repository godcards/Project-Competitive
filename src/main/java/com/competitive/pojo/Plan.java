package com.competitive.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
    private int planId;
    private String planAuthorid;
    private String planDetial;
    private String type;
    private String planTitle;
}
