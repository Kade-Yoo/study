package com.example.mini;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mini.model.PostgresPracticeUser;
import com.example.mini.repository.PostgresPracticeRepository;

import lombok.extern.slf4j.Slf4j;

// SpringBootTest와 DataJpaTest를 같이 사용할 수 없음....
//@SpringBootTest
// JUnit 실행시 SpringRunner class라는 확장된 클래스를 사용
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
class MiniProjectApplicationTests {
	@Autowired
	PostgresPracticeRepository repository;
	
	// JPA를 통해서 data insert, select, update
	@Test
	void jpa_practice01() {
		// data insert
		PostgresPracticeUser user = PostgresPracticeUser.builder()
							.userEmail("yhm9207@naver.com")
							.userId("yhm0726")
							.userName("유형민")
							.userPwd("dkagh")
							.build();
		repository.save(user);
		
		// data select
		List<PostgresPracticeUser> users = repository.findAll();
		
		for(PostgresPracticeUser user2 : users) {
			log.info("id : {}",user2.getId());
			log.info("userEmail : {}",user2.getUserEmail());
			log.info("userName : {}",user2.getUserName());
			log.info("userId : {}",user2.getUserId());
			log.info("userPwd : {}",user2.getUserPwd());
		}
		
		// data update
	}

}
