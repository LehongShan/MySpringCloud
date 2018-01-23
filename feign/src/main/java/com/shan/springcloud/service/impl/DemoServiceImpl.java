package com.shan.springcloud.service.impl;

import com.shan.springcloud.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by shanlehong on 2018/1/23.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
