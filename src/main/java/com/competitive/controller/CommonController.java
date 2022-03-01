package com.competitive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping({"/","/tologin"})
    public String tologin(){
        return "login";
    }
    @PostMapping("/login")
    public String login(Model model, @RequestParam("user") String user,@RequestParam("passwd") String passwd){
        if (user.equals("yxx") && passwd.equals("123456")){
            return "redirect:main";
        }else {
            model.addAttribute("msg","密码或账号错物");
            return "login";
        }
    }

}
