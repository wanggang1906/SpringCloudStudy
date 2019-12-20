package com.xyz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


// 回调类，实现HelloRemote方法
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello world来自feign-hystrix---(服务已断掉，进回调方法)";
    }
}
