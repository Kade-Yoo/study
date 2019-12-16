package com.example.mini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.model.PostgresPracticeUser;
import com.example.mini.service.PostgresPracticeService;

import javassist.NotFoundException;

@RestController
@RequestMapping("/api/v1")
public class PostgresPracticeRestController {
	
	@Autowired
	private PostgresPracticeService service;
	
	@PostMapping("/create/user/")
	public PostgresPracticeUser createUser(@RequestBody PostgresPracticeUser user) {
		return service.createUser(user);
	}
	
	@GetMapping("/get/user/{id}")
	public PostgresPracticeUser getUser(@PathVariable(value = "id") Long userId) throws NotFoundException {
		return service.getUser(userId);
	}
	
	@GetMapping("/get/users")
	public List<PostgresPracticeUser> getUsers() {
		return service.getUsers();
	}
}
