package com.competitive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private int userId;
   private String userName;
   private int password;
   private String userIcon;
   private String phone;
   private String role;
   private String studioId;
}
