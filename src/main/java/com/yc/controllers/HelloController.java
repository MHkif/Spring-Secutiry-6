package com.yc.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("*")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/")
    public String home(){
        return "Home page";
    }

    @GetMapping("/admin")
    public String dashboard(){
        return "Admin panel";
    }

    @GetMapping("/user")
    public String panel(){
        return "user panel";
    }

    @GetMapping("/UnAuthorized")
    public String unAuthorized(){
        return "UnAuthorized";
    }
}
