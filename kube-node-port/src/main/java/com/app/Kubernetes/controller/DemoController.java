package com.app.Kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/name")
    public String getName(){
        return "Hello Wasim!";
    }
}
