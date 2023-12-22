package com.mvcvue.controller.api.enjoy;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/enjoy")
public class EnjoyController {
    @GetMapping
    public ResponseEntity<String> enjoy(String temp){
        return ResponseEntity.ok("hahaha");
    }
}
