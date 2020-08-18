package com.example.DevOps.Jenkins_Project.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class Home_Controller {
	
	@GetMapping
	public String HomePage() throws DocumentException, FileNotFoundException {
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
