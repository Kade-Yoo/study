package com.example.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostgresPracticeController {
	
	@GetMapping("/")
	public String getTestView() {
		return "test";
	}
}
