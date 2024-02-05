package com.yc.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        var authUser = SecurityContextHolder.getContext().getAuthentication();

        return "Hello "+ authUser.getName();
    }

    @GetMapping("/")
    public String home(){
        return "Home page";
    }

    @GetMapping("/admin")
    public String adminPanel(){
        return "Admin panel";
    }

    @GetMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public String dashboard(){
        return "Dashboard";
    }

    @GetMapping("/user")
    public String userPanel(){
        return "user panel";
    }

    @GetMapping("/UnAuthorized")
    public String unAuthorized(){
        return "UnAuthorized";
    }
}
