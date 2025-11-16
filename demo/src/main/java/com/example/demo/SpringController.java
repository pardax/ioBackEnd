package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
    
    @GetMapping("/")
    public String hello(){
        return "redirect:/index.html";
    }
    
}
