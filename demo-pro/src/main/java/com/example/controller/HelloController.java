package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2019-12-12.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    // 此处的地址不要更改
    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + " " + new Date() + "我是服务提供者";
    }

}