package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/")
public class HelloCon {

    @RequestMapping("hello")
    public String hello(){
        return "hello 来自Zuul的con层";
    }
}
