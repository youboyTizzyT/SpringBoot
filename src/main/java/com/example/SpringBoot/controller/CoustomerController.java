package com.example.SpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CoustomerController {
    @RestController
    public class HelloWorldController {
        @RequestMapping("/hello")
        public String index() {
            return "Hello World";
        }
    }
}
