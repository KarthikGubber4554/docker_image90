package com.docker111.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NammaDharawadaController {

    @GetMapping("/message")
    public String getMessage() {
        return "HELLO MYSURU";
    }
}
