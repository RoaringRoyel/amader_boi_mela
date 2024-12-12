package com.example.boi.mela.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class login_controller {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Ensure 'login.html' is in the 'templates' folder
    }
}
