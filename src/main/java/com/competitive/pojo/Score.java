package com.competitive.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    private int scoreId;
    private int userId;
    private int score;
    private String time;


}
