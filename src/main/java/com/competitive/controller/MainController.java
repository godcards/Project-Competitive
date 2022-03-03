package com.competitive.controller;

import com.competitive.dao.TaskMapper;
import com.competitive.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    //主页
    @RequestMapping("/main")
    public String main(Model model, HttpServletResponse response, HttpServletRequest request, HttpSession session){
        model.addAttribute("name",session.getAttribute("name"));
        return "main";
    }
}
