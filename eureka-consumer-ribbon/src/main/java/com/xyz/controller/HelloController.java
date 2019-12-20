package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String hello(@RequestParam String name){
        name += "!Ribbon";
        // 使用主机地址访问
        String url = "http://localhost:8000/hello/test?name=" + name;
        // 使用服务名访问----有错
        //String url = "http://eureka-producer/hello/test?name=" + name;
        return restTemplate.getForObject(url,String.class);
    }
}
