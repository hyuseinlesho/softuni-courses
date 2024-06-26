package com.resellerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }
    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }
}
