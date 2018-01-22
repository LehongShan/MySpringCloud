package com.shan.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 41973_000 on 2018-1-22.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String demoService(String name) {
        return restTemplate.getForObject("http://service-provider-demo01/hi?name="+name,String.class);
    }
}
