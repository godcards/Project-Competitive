package com.competitive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    //主页
    @RequestMapping("/main")
    public String main(Model model,HttpSession session){
        model.addAttribute("name",session.getAttribute("name"));
        return "main";
    }

    //跳转到登录页
    @RequestMapping("/")
    public String tolonin(){
        return "/login";
    }
}
