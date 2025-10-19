package com.example2.Form_based_auth.controller;

// Controls the routing between login page and welcome page

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Loads login.html
    }



    @GetMapping("/welcome")
    public String welcome() {
        return "welcome"; // Loads welcome.html
    }
}
