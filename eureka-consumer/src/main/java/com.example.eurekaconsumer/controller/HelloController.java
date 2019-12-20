package com.example.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/hello")
@RestController
@ComponentScan("com.example")
public class HelloController {

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;

    // 此处不要更改
    @GetMapping("/test")
    public String hello(@RequestParam String name){
        name += "";
        // 服务消费者名字，本服务是消费者，所以是本服务名字
        // lb的choose方法选择负载均衡机制
        ServiceInstance instance = client.choose("eureka-producer");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/test?name=" + name;
        //String url = "http://localhost:8000/hello/test?name=111";
        // 用get方式访问提供者
        return restTemplate.getForObject(url,String.class);
    }

    // 测试和前端联调的测试方法
    @RequestMapping("/consumer")
    public String sayStr(){
        return "这是后台-服务消费者";
    }
}
