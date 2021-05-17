package com.bluesoft.controller;

import com.bluesoft.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    private final DemoService service;

    @Autowired
    public DemoController(DemoService service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("welcome")
    public String welcome(Model model){
        model.addAttribute("helloMessage",service.getHelloMessage("janusz"));
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() called" );
        return service.getWelcomeMessage();
    }

}
