//package com.example.boi.mela.controller;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//    @Configuration
//    public class WebConfig {
//
//        @Bean
//        public WebMvcConfigurer corsConfigurer() {
//            return new WebMvcConfigurer() {
//                @Override
//                public void addCorsMappings(CorsRegistry registry) {
//                    registry.addMapping("/**")
//                            .allowedOrigins("http://127.0.0.1:5500")  // Use frontend's exact origin
//                            .allowedMethods("GET", "POST", "OPTIONS")
//                            .allowCredentials(true)  // Allow credentials (cookies)
//                            .allowedHeaders("*");}
//            };
//        }
//    }
//
