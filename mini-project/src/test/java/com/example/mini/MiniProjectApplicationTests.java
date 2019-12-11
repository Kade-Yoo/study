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

// SpringBootTest�� DataJpaTest�� ���� ����� �� ����....
//@SpringBootTest
// JUnit ����� SpringRunner class��� Ȯ��� Ŭ������ ���
//@RunWith(SpringRunner.class)
//@DataJpaTest
@ExtendWith(SpringExtension.class)
//@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
// Web Mvc ȯ�濡�� Test �� �� �ֵ�����
@WebMvcTest(PostgresPracticeRestController.class)
class MiniProjectApplicationTests {
//	@Autowired
//	PostgresPracticeRepository repository;
	
	@Autowired
	MockMvc mvc;
	
	// JPA�� ���ؼ� data insert, select, update
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
		
		// MockMvc Mvc ȯ���� ����
		// MockMvcRequestBuilders�� ��û �����͸� �����Ѵ�.
		// post(url) post�������� ��û
		// cotent() content�� � �� �����ڴ�.
		// contentType() type�� json���� �����ڴ�.		
		mvc.perform(MockMvcRequestBuilders
					.post("/api/v1/create/user/")
					.content(asJsonString(setUser()))
					.contentType(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON))
					// MockMvcResultMatchers ��� ����
						.andExpect(status().isCreated())
						.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
						// MockMvcResultHandlers ���� ��� ���
							.andDo(print());
	}
	
	public static String asJsonString(final Object obj) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(obj);
	}
	
	public static PostgresPracticeUser setUser() {
		return PostgresPracticeUser.builder()
				.userEmail("yhm9207@naver.com")
				.userId("yhm0726")
				.userName("������")
				.userPwd("dkagh")
				.build();
	}
}
