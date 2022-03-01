package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.dao.UserMapper;
import com.competitive.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudioMapper studioMapper;



    @RequestMapping("/sql")
    @ResponseBody
    public List<User> quire(){
        List<User> users = userMapper.selAlluser();
        return users;
    }
    @RequestMapping("/sqlall/{userId}/")
    @ResponseBody
    public String quireByname(@PathVariable int userId){
        return userMapper.seluserById(userId).toString();
    }
    @RequestMapping("/toins")
    public String toins(){
        return "InsertUser";
    }
    @RequestMapping("/insert")
    public String InsUser(User user, Model model){
        model.addAttribute("msg","注册有问题");
        userMapper.insuser(user);
        return "login";
    }
}
