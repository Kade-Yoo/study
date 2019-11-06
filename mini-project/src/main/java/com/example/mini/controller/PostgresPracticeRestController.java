package com.example.mini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.model.PostgresPracticeUser;
import com.example.mini.repository.PostgresPracticeRepository;

@RestController
@RequestMapping("/practice")
public class PostgresPracticeRestController {
	
	@Autowired
	private PostgresPracticeRepository repository;
	
	@GetMapping("/users")
	public List<String> getUsers() {
		return repository.selectUsers();
	}
	
	@PostMapping("/create/user")
	public void createUser(@RequestBody PostgresPracticeUser user) {
		repository.insertUser(user.getUserId(), user.getUserName());
	}
}
