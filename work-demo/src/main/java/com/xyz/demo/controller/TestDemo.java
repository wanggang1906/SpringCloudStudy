package com.xyz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/")
public class TestDemo {

    @RequestMapping("st")
    public void st(){
        System.out.println("来自testDemo");
    }
}
