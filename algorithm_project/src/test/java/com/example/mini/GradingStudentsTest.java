package com.example.mini;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GradingStudentsTest {
	
	private GradingStudents gradingStudents = new GradingStudents();
	
	@Before
	public void init() {
		gradingStudents = new GradingStudents();
	}
	
	// Grading Students
	@Test
	void gradingStudents() {
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		List<Integer> answers = Arrays.asList(75, 67, 40, 33);
		
		assertThat(gradingStudents.solveProblem(grades)).isEqualTo(answers);
	}
}
