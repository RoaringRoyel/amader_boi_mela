package com.example.boi.mela.controller;


import com.example.boi.mela.entity.userEntry;
import com.example.boi.mela.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class login_controller {
    @Autowired
    private userService userservice;
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Ensure 'login.html' is in the 'templates' folder
    }


    @PostMapping("/login")
    public String handleLogin(userEntry user, Model model){
        if (userservice.validateUser(user.getUsername(), user.getPassword())) {
            userEntry foundUser = userservice.findByUsername(user.getUsername());
            model.addAttribute("user", foundUser);
            return "dashboard"; // Render dashboard.html
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Render login.html with an error message
        }
    }


}

//    @PostMapping("/login")
//    public String HandleUser(){
//        return "login";
//    }
//    @PostMapping("/login")
//    public String handleLogin(userEntry user, Model model) {
//
//        userEntry foundUser = userservice.findByUsername(user.getUsername());
//
//        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
//            // Redirect to dashboard if login is successful
//            model.addAttribute("user", foundUser);
//            return "Dashboard";
//        }


