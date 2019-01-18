package com.jk.controller;

import com.jk.pojo.Role;
import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user, Model model){
        model.addAttribute("user","ahhhh");
        if(userService.login(user).size()>0){
            System.out.println("1111111111111111111111111111111111");
            return "test";
        }else{
            System.out.println("22222222222222222222222222222222222");
            return "test";
        }
    }
    @ResponseBody
    @RequestMapping("getRole")
    public List<Role> getRoles(){

        return userService.getRoles();
    }
    @ResponseBody
    @RequestMapping("updateRole")
    public void updateRole(Role role){

         userService.updateRole(role);
    }
    @ResponseBody
    @RequestMapping("delRole")
    public void delRole(String id){

        userService.delRole(id);
    }
    @ResponseBody
    @RequestMapping("addRole")
    public void addRole(Role role){

        userService.addRole(role);
    }
}
