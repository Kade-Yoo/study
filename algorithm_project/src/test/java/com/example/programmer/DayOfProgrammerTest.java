package com.example.programmer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.programmer.factory.ProgrammerFactory;
import com.example.programmer.service.ProgrammerService;

class DayOfProgrammerTest {
	private ProgrammerService service = ProgrammerFactory.getInstance();
	
	@Test
	void test() {
		assertThat(service.calculateLeapYear(2017)).isEqualTo("13.09.2017");
	}

	@Test
	void secondTest() {
		assertThat(service.calculateLeapYear(2016)).isEqualTo("12.09.2016");
	}
	
	@Test
	void thirdTest() {
		assertThat(service.calculateLeapYear(1800)).isEqualTo("12.09.1800");
	}
}
