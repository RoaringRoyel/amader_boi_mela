package com.example.boi.mela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class car {

    @Autowired
    private dog dog;
    @GetMapping("/car")
    public String car(){
        return "hi" + dog.fun();
    }
}
