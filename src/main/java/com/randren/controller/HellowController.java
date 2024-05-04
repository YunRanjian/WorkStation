package com.randren.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @RequestMapping("/Hello")
    public String Hellow() {
        return "Hello World!";
    }
}
