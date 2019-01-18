package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.jk.mapper")
@EnableDiscoveryClient
public class LoginPApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginPApplication.class, args);
    }

}

