package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class toLoginController {
    @RequestMapping("toView")
    public String ToLogin(String location){
        return location;
    }
}
