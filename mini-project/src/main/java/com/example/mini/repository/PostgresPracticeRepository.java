package com.example.mini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mini.model.PostgresPracticeUser;

@Repository
public interface PostgresPracticeRepository extends JpaRepository<PostgresPracticeUser, Long>{
	
}
