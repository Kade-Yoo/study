package com.example.mini.service;

import java.util.List;

import com.example.mini.model.PostgresPracticeUser;

import javassist.NotFoundException;

public interface PostgresPracticeService {
	PostgresPracticeUser getUser(Long id) throws NotFoundException;
	List<PostgresPracticeUser> getUsers();
	PostgresPracticeUser createUser(PostgresPracticeUser user);
}
