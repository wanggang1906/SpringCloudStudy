package com.xyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Feign客户端接口

@FeignClient(name = "eureka-producer")
public interface HelloRemote {

    // 这个方法名要和远端服务的方法名一致
    @GetMapping("/hello/test")
    String hello(@RequestParam(value = "name") String name);
}
