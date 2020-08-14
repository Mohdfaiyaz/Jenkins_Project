package com.example.DevOps.Jenkins_Project.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_Controller {
	
	@GetMapping
	public String HomePage() {
		LocalDateTime date_time=LocalDateTime.now();
		return "Hi Faiyaz,\n Date & Time  "+date_time;
	}
	
	@GetMapping("/date")
	public String HomePage1() {
		LocalDate date_time=LocalDate.now();
		return "Hi Faiyaz \n Date  "+date_time;
	}
	
//	@GetMapping("/time")
//	public String HomePage3() {
//		LocalDate date_time=LocalDate.now();
//		return "Hi Faiyaz \n Date  "+date_time;
//	}
	

}
