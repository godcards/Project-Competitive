package com.competitive.controller;

import com.competitive.pojo.Task;
import com.competitive.pojo.User;
import com.competitive.service.Userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    Userservice userservice;

    @PostMapping("/")
    public Map<String,Object> login(String userName,String password,Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Map<String,Object> map=new HashMap<>();
        Subject utils=SecurityUtils.getSubject();
        session.setAttribute("name",userName);
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
            //执行登陆方法
            try {
                utils.login(token);
                map.put("code","200");
            } catch (UnknownAccountException uae) {
                map.put("code","401");
            } catch (IncorrectCredentialsException ice) {
                map.put("code","402");
            }
            return map;
        }
    //查询当前用户的所有信息
    @RequestMapping("/user/selId")
    public User SelectUserById(HttpSession session){
        return userservice.SelectUserById(userservice.SelectUserId((String) session.getAttribute("name")));
    }

    //更新你的用户
    @PostMapping("/user/upduser")
    public Map<String,String> UpdateUser(HttpSession session,String userName,String password,String userIcon,String phone){
        User user=new User();
        Map<String,String> map=new HashMap<>();
        user.setUserName(userName);
        user.setPassword(password);
        user.setUserIcon(userIcon);
        user.setPhone(phone);
        int i = userservice.SelectUserId((String) session.getAttribute("name"));
        user.setUserId(i);
        int ret = userservice.UpdateUser(user);
        if (ret==0){
            map.put("code","403");
        }else {
            map.put("code","200");
        }
        return map;
    }
    @RequestMapping("/NotLogged")
    public String not(){
        return "请登录(客户端特供)";
    }

}

