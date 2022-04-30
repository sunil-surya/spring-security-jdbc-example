package com.sunil.infotech.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello(){
        return "Hello!! Welcome to Spring Security";
    }

    @RequestMapping("/admin")
    public String helloAdmin(){
        return "Hello!! <h3>Admin<h3> Welcome to Spring Security";
    }

    @RequestMapping("/user")
    public String helloUser(){
        return "Hello!! <h3>User<h3> Welcome to Spring Security";
    }

}
