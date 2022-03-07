package com.competitive.dao;

import com.competitive.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    //查询用户所有的信息根据id
    @Select("select * from user where user_id=#{userId}")
    User SelectUserById(int userId);

    //查询用户的id根据用户名
    @Select("select user_id from user where user_name=#{userName}")
    int SelectUserId(String userName);

    //登陆实现
    @Select("select user_name,password from user where user_name=#{userName}")
    User SelectUserNamePassWord(String userName);

    //添加用户(注册)
    @Insert("insert into user(user_name,phone,role,studio_id) values (#{userName},#{phone},#{role},#{studioId})")
    int InsertUser(User user);

    //更改用户的信息
    @Update("update user set user_name = #{userName},phone = #{phone},password = #{password} ,user_icon = #{userIcon} where user_id = #{userId}")
    int UpdateUser(User user);

}
