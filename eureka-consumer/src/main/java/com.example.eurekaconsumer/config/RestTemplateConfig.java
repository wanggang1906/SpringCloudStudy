package com.example.eurekaconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


public class RestTemplateConfig {


    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
