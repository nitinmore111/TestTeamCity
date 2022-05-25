package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	
	@RequestMapping("/register")
	public String showRegistration() {
		
		System.out.println("inside the register method");
		return "SpecializationRegister";

	}


}
