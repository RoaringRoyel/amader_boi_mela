package com.example.boi.mela.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main_controller {

    @GetMapping("/search_book")
    public String search_book(){
        return "search_book";
    }
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Ensure 'login.html' is in the 'templates' folder
    }
}
