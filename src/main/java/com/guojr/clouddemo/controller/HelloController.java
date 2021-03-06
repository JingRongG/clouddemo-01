package com.guojr.clouddemo.controller;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private CounterService counterService;

    @RequestMapping("/hello")
    public String index(){
        counterService.increment("didispace.hello.count");
        return "Hello World";
    }
}
