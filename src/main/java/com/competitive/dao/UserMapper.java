package com.competitive.dao;

import com.competitive.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where user_id=#{user_id}")
    User seluserById(int userId);

    @Select("select * from user")
    List<User> selAlluser();

    @Insert("insert into user(user_name,phone,role,studio_id) values (#{user_name},#{phone},#{role},#{studio_id})")
    int insuser(User user);
}
