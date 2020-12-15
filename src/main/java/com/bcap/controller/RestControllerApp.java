package com.bcap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mode")
public class RestControllerApp {
	
	@GetMapping
	public String showMessage() {
		return "Welcome to Jenkins application and integration with Docker.";
	}

}
