package com.shan.springcloud.web;

import com.shan.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 41973_000 on 2018-1-22.
 */
@RestController
@RequestMapping("/ribbon")
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/demo01")
    public String hi(@RequestParam String name){
        return helloService.demoService(name);
    }
}
