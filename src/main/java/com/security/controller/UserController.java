package com.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

//        @GetMapping("/user")
//        public String get(Authentication authentication) {
//            return "welcome"+authentication.getName()+"to spring security";
//        }


    @GetMapping("/user")
    public String get() {
        return "welcome to spring security";
    }


    @GetMapping("/hello")
    public String getHello() {
        return "welcome Hello to spring security";
    }
}
