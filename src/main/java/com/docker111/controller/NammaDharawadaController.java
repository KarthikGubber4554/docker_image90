package com.docker111.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class NammaDharawadaController {

@RestController
public class HelloBengaluruControllerMessage {
	
	@GetMapping("/message")
	public String getMessage() {
		return "HELLO DHARAWADA";
	}

}
}
