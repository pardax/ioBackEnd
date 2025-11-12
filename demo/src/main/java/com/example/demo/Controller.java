package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //임시 테스트
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
    
}
