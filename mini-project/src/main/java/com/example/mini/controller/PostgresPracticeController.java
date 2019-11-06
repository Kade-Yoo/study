package com.example.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/practice")
public class PostgresPracticeController {
	
	@GetMapping("/")
	public String showPracticeView() {
		return "/index.jsp";
	}
}
