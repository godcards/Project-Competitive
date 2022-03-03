package com.competitive.controller;

import com.competitive.dao.StudioMapper;
import com.competitive.dao.UserMapper;
import com.competitive.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String tolonin(){
        return "/login";
    }

    @RequestMapping("/mobile/userLogin")
    public String login(@RequestParam("userName") String userName, @RequestParam("password") int password, Model model, HttpSession session, HttpServletRequest request){
        User seluserpass = userMapper.seluserpass(userName, password);
        if (seluserpass != null){
            HttpSession hs=request.getSession();
            session.setAttribute("name",userName);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","账号密码不对");
            return "login";
        }
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
        model.addAttribute("massage","注册有问题");
        userMapper.insuser(user);
        return "login";
    }
}

