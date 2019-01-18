package com.jk.client;

import com.jk.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-login")
public interface LoginClient {
    @RequestMapping("login")
     User Login(User user);
}
