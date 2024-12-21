package com.example.boi.mela.controller;


import com.example.boi.mela.entity.userEntry;
import com.example.boi.mela.service.userService;
import jakarta.servlet.http.HttpSession;
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
    public String showLoginPage(HttpSession session) {
        userEntry loggedInUser = (userEntry) session.getAttribute("user");
        if (loggedInUser != null) {
            // If no user is found in session, redirect to login
            return "redirect:/dashboard";
        }
        else {
            return "login";  // Ensure 'login.html' is in the 'templates' folder
        }
    }


    @PostMapping("/login")
    public String handleLogin(userEntry user, Model model,HttpSession session){

        userEntry loggedInUser = (userEntry) session.getAttribute("user");
        if (loggedInUser != null) {
            // If no user is found in session, redirect to login
            return "redirect:/dashboard";
        }
        else{
            if (userservice.validateUser(user.getUsername(), user.getPassword())) {
                userEntry foundUser = userservice.findByUsername(user.getUsername());
                model.addAttribute("user", foundUser);
                session.setAttribute("user", foundUser);
                return "redirect:/dashboard"; // Render dashboard.html
            } else {

                model.addAttribute("error", "Invalid username or password");
                return "login"; // Render login.html with an error message
            }
        }

    }

    @GetMapping("/dashboard")
    public String showDashboard(HttpSession session, Model model){
        userEntry loggedInUser = (userEntry) session.getAttribute("user");
        if (loggedInUser == null) {
            System.out.println("Error in finding people");
            // If no user is found in session, redirect to login
            return "redirect:/login";
        }

        // Add the user to the model if they are logged in
        model.addAttribute("user", loggedInUser);
        return "dashboard"; // Return the dashboard view
    }
    @GetMapping("/logout")
    public String handleLogout(HttpSession session) {
        session.invalidate();
        return "redirect:/login"; // Redirect to login page after logout
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


