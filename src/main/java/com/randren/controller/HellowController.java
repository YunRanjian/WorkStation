package com.randren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @Value("${name}")
    private String name;
    @Value("${owner.age}")
    private String age;
    @Autowired
    private Environment env;
    @Autowired
    private Owner owner;

    /**
     This is my controller
     **/
    @RequestMapping("/Hello")
    public String Hellow() {
        return String.format("%s %s %s", owner.getName(), owner.getAge(), env.getProperty("studyDate[0]"));
    }



}
