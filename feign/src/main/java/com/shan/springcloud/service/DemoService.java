package com.shan.springcloud.service;

import com.shan.springcloud.service.impl.DemoServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shanlehong on 2018/1/23.
 */
@FeignClient(value = "service-provider-demo01",fallback = DemoServiceImpl.class)
public interface DemoService {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
