package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppSvcController {

	@GetMapping("/health-check")
	public String heath_check() {
		return "I am healthy and running as azure webapp!";
	}

	@GetMapping("/hello-world")
	public String hello_world() {
		return "Hello World from azure webapp free tier!";
	}	

}
