package com.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/security")
public class MyController {
    @GetMapping("/path")
    public String hello() {
        return "hybrid";

    }

}
