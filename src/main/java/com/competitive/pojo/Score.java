package com.competitive.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    private int scoreId;
    private int userId;
    private String score;
    private Date time;


}
