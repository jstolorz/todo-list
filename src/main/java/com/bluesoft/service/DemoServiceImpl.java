package com.bluesoft.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String name) {
        return "Hello " + name;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo aplication";
    }
}
