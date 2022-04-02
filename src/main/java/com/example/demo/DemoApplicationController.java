package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-app")
public class DemoApplicationController {
    @RequestMapping
    String demofunction(){
        String hello="Demo App";
        return hello;
    }
}
