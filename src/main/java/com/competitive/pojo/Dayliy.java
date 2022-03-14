package com.competitive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dayliy {
    private int dayId;
    private String dayText;
    private String dayName;
    private String authorId;
    private Date createTime;
    private Date updateTime;
}
