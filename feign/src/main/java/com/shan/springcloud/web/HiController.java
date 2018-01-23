package com.shan.springcloud.web;

import com.shan.springcloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shanlehong on 2018/1/23.
 */
@RestController
@RequestMapping("/feign")
public class HiController {
    @Autowired
    DemoService demoService;
    @GetMapping(value = "/demo")
    public String sayHi(@RequestParam String name){
        return demoService.sayHiFromClientOne(name);
    }
}
