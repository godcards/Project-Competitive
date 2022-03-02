package com.competitive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dayliy {
    private int day_id;
    private String day_text;
    private String day_name;
    private Date create_time;
    private Date update_time;
}
