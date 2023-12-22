package com.mvcvue.controller.api.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> hello(){
        System.out.println("Hello Contoller 로직 수행!");
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/exception")
    public void exception() throws FileNotFoundException {
        throw  new FileNotFoundException();
    }
}
