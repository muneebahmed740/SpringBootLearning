package com.springbootlearning.start.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    

    @GetMapping("/hello")
    public String checkHealth(){
        return "Server is running";
    }
}
