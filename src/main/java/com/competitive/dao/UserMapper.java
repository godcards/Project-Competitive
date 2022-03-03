package com.competitive.dao;

import com.competitive.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where user_id=#{user_id}")
    User seluserById(int userId);

    @Select("select user_id from user where user_name=#{userName}")
    User selUserId(String userName);

    @Select("select user_name,password from user where user_name=#{userName} and password=#{password}")
    User seluserpass(String userName,int password);

    @Insert("insert into user(user_name,phone,role,studio_id) values (#{user_name},#{phone},#{role},#{studio_id})")
    int insuser(User user);

    @Update("update user set user_name = #{user_name},phone = #{phone},password = #{password} ,user_icon = #{user_icon} where user_id = #{user_id}")
    int upduser(User user);

}
