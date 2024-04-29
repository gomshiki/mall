package com.example.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("message", "안녕하세요~!");

        return "home.html";
    }
}
