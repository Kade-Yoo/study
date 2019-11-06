package com.example.mini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mini.model.PostgresPracticeUser;

@Repository
public interface PostgresPracticeRepository extends JpaRepository<PostgresPracticeUser, Long>{

	List<String> selectUsers();
	boolean insertUser(String userId, String userName);
}
