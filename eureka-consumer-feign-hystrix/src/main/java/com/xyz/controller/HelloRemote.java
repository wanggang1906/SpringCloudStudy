package com.xyz.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component  // 不加是@Autowired会报红线，但不影响程序运行
@FeignClient(name = "eureka-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello/test")
    String hello(@RequestParam(value = "name") String name);
}
