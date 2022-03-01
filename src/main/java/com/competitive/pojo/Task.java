package com.competitive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private String taskTitle;
    private String progress;
    private int taskId;
    private String taskContent;
    private String authorId;
    private Date create_time;
    private Date update_time;
}
