package com.springboot.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
}