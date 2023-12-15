package com.mvcvue.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home1(){
        return "test1.html";
    }

    @GetMapping("/2")
    public String home2(){
        return "test2.html";
    }

    @GetMapping("/3")
    public String home3(){
        return "index.html";
    }
}
