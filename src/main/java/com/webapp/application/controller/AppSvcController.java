package com.webapp.application.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0")
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
