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
	 * db���� �ش� id�� data select 
	 * validation üũ����
	 */
	@Override
	public PostgresPracticeUser getUser(Long id) throws NotFoundException {
		// findById() �� return ���� Optional<T> �̴�.
		// ������ ����?
		return repository.findById(id).orElseThrow(() -> new NotFoundException("user id not found"));
	}

	// ��� user �˻�
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
