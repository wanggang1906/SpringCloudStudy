package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);

    }

// 配置统一在配置类中，此处不再写配置，否则会出现重复注入问题
//    @LoadBalanced
//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
