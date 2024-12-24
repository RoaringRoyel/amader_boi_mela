//package com.example.boi.mela.controller;
//import com.example.boi.mela.entity.userEntry;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.*;
////    package com.example.session.smsr;
//        @RestController
//        @RequestMapping("/api")
//        @CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true") // Specific origin and credentials
//        public class SessionController {
//            // Set a session attribute
//            @PostMapping("/setSession")
//            public String setSession(HttpSession session) {
//                System.out.println("HI I AM IN BACKEND");
//                session.setAttribute("username", "testUser");
//                return "Session set successfully!";
//            }
//            // Retrieve the session attribute
//            @GetMapping("/getSession")
//            public String getSession(HttpSession session) {
//                System.out.println("HI I AM IN BACKEND");
//                String username = (String) session.getAttribute("user1");
//                //userEntry loggedInUser = (userEntry) session.getAttribute("user1");
//                //String username = loggedInUser.getUsername();
//                System.out.println("HI I AM IN BACKEND"+username);
//                return username != null ? "Username: " + username : "No session found!";
//                //return username;
//            }
//        }