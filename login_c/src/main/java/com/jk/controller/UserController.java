package com.jk.controller;

import com.jk.client.LoginClient;
import com.jk.pojo.User;
import com.jk.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    private LoginClient loginClient;
    @RequestMapping("login")
    public String Login(User user, HttpServletResponse response, HttpSession session){
        User u = loginClient.Login(user);
        if (u!=null) {
            session.setAttribute("user",u);
            if (user.getRempswd()!=null) {
                String msg=user.getUseraccount()+Constant.label+user.getUserpassword();
                Cookie cookie = new Cookie(Constant.msg,msg);
                //设置在根目录就可以访问
                cookie.setPath("/");
                //设置过期时间    单位：秒
                cookie.setMaxAge(604800);
                //将自定义的cookie放到响应头  存放在浏览器内存中
                response.addCookie(cookie);
            }else {
                Cookie cookie = new Cookie(Constant.msg,null);
                cookie.setPath("/");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            return "1";
        }
        return "0";

    }
        @RequestMapping("RestShow")
        public String RestShow(HttpServletRequest request){
            Cookie[] cookies = request.getCookies();
            String cookieval="";
            if (cookies!=null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals(Constant.msg)) {
                        cookieval=cookie.getValue();
                    }
                }
            }
            return cookieval;
        }
}
