package com.example.spring.security.spring_basic_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/noauth")
public class NoAuthController {

    @GetMapping("/get")
    public String NoAuth(){
        return "hello rahul";
    }
}
