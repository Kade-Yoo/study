package com.example.mini;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.mini.controller.PostgresPracticeRestController;
import com.example.mini.model.PostgresPracticeUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

// SpringBootTest와 DataJpaTest를 같이 사용할 수 없음....
//@SpringBootTest
// JUnit 실행시 SpringRunner class라는 확장된 클래스를 사용
//@RunWith(SpringRunner.class)
//@DataJpaTest
@ExtendWith(SpringExtension.class)
//@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
// Web Mvc 환경에서 Test 할 수 있도록함
@WebMvcTest(PostgresPracticeRestController.class)
class MiniProjectApplicationTests {
//	@Autowired
//	PostgresPracticeRepository repository;
	
	@Autowired
	MockMvc mvc;
	
	// JPA를 통해서 data insert, select, update
//	@Test
//	void jpa_practice01() {
//		PostgresPracticeUser user = setUser();
//		
//		// data insert
//		repository.save(user);
//		
//		log.info(user.getUserEmail());
//		
//		// data update
//		user.setUserEmail("yhm9207@gmail.com");
//		
//		// data select
//		List<PostgresPracticeUser> users = repository.findAll();
//		
//		for(PostgresPracticeUser user2 : users) {
//			log.info("id : {}",user2.getId());
//			log.info("userEmail : {}",user2.getUserEmail());
//			log.info("userName : {}",user2.getUserName());
//			log.info("userId : {}",user2.getUserId());
//			log.info("userPwd : {}",user2.getUserPwd());
//		}
//		
//	}
	
	@Test
	void jpa_practice02() throws JsonProcessingException, Exception {
		
		// MockMvc Mvc 환경을 재현
		// MockMvcRequestBuilders란 요청 데이터를 설정한다.
		// post(url) post형식으로 요청
		// cotent() content는 어떤 걸 보내겠다.
		// contentType() type은 json으로 보내겠다.		
		mvc.perform(MockMvcRequestBuilders
					.post("/api/v1/create/user/")
					.content(asJsonString(setUser()))
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON))
					// MockMvcResultMatchers 결과 검증
						.andExpect(status().isCreated())
						.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
						// MockMvcResultHandlers 실행 결과 출력
							.andDo(print());
	}
	
	public static String asJsonString(final Object obj) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(obj);
	}
	
	public static PostgresPracticeUser setUser() {
		return PostgresPracticeUser.builder()
				.userEmail("yhm9207@naver.com")
				.userId("yhm0726")
				.userName("유형민")
				.userPwd("dkagh")
				.build();
	}
}
