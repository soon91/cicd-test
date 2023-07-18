package com.example.testcicd;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @CrossOrigin()
    public String hello() {
        return "CICD 작동 테스트2 테스트5";
    }
}
