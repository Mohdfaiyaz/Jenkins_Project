package com.example.DevOps.Jenkins_Project.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_Controller {
	
	@GetMapping
	public String HomePage() {
		LocalDateTime date_time=LocalDateTime.now();
		return "Hi Faiyaz \n Date & Time  "+date_time;
	}
}
