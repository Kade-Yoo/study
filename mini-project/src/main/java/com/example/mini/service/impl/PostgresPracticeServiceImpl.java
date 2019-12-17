package com.example.mini.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mini.model.PostgresPracticeUser;
import com.example.mini.repository.PostgresPracticeRepository;
import com.example.mini.service.PostgresPracticeService;

import javassist.NotFoundException;

@Service
public class PostgresPracticeServiceImpl implements PostgresPracticeService{

	@Autowired
	PostgresPracticeRepository repository;
	
	/**
	 * db에서 해당 id인 data select 
	 * validation 체크까지
	 */
	@Override
	public PostgresPracticeUser getUser(Long id) throws NotFoundException {
		// findById() 는 return 값이 Optional<T> 이다.
		// 이유는 뭘까?
		return repository.findById(id).orElseThrow(() -> new NotFoundException("user id not found"));
	}

	// 모든 user 검색
	@Override
	public List<PostgresPracticeUser> getUsers() {
		return repository.findAll();
	}

	// user insert
	@Override
	public PostgresPracticeUser createUser(PostgresPracticeUser user) {
		return repository.save(user);
	}
	
}
