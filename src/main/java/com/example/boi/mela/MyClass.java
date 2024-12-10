package com.example.boi.mela;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //creating an  API
public class MyClass {
    @GetMapping("hello") // local_host/hello   = address
    public String sayHello(){
        return "Hello";
    }
}
