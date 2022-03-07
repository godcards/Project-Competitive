package com.competitive.controller;

import com.competitive.dao.UserMapper;
import com.competitive.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.netty.NettyWebServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    //判断登录 (没用拦截器，记录用了session)
    @RequestMapping("/loginIn")
    public String login(@RequestParam("userName") String userName,String password,Model model,HttpServletRequest request){
        Subject utils=SecurityUtils.getSubject();
        HttpSession session = request.getSession();
        session.setAttribute("name",userName);
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        if (!token.getUsername().isEmpty() && token.getPassword().equals("")){
            return "/";
        }else {
            //执行登陆方法
            try {
                utils.login(token);
                return "redirect:main";
            } catch (UnknownAccountException uae) {
                model.addAttribute("msg", "用户名错误");
                return "login";
            } catch (IncorrectCredentialsException ice) {
                model.addAttribute("msg", "密码错误");
                return "login";
            }
        }
    }

    //查询当前用户的所有信息
    @RequestMapping("/user/selId")
    @ResponseBody
    public User SelectUserById(HttpSession session){
        return userMapper.SelectUserById(userMapper.SelectUserId((String) session.getAttribute("name")));
    }

    //更新你的用户
    @RequestMapping("/user/upduser")
    @ResponseBody
    public int UpdateUser(HttpSession session,User user){
        int yourId = userMapper.SelectUserId((String) session.getAttribute("name"));
        return userMapper.UpdateUser(user);
    }


}

