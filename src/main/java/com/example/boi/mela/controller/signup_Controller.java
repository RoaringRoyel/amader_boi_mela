package com.example.boi.mela.controller;

import com.example.boi.mela.entity.userEntry;
import com.example.boi.mela.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class signup_Controller {

    @Autowired
    private userService userservice;


    @PostMapping("/sign-up")
    public String handleSignup(userEntry user, Model model) {
        // Check if the username already exists
        userEntry existingUser = userservice.findByUsername(user.getUsername());
        if (existingUser != null) {
            model.addAttribute("error", "Username already exists.");
            //return "already exists";
            return "login"; // Redirect back to login page if username exists
        }

         //Check if the password and confirmation password match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error", "Passwords do not match.");
            //return "Password not matched";
            return "login"; // Redirect back to login page if passwords don't match
        }

        // Save new user
        userservice.saveEntry(user);
        System.out.println(user+"Here it is saving");
        model.addAttribute("message", "Account created successfully! Please log in.");
        //return "User added";
        return "login"; // Redirect to login page after successful signup
    }
}
