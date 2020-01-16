package com.example.mini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmProjectApplication.class, args);
		test();
	}

	public static void test() {
		List<Integer> testCase = new ArrayList<>();
		testCase.add(2);
		testCase.add(4);
		testCase.add(1);
		testCase.add(6);
		testCase.add(5);
		testCase.add(9);
		testCase.add(7);
		
		int t = testCase.indexOf(Collections.min(testCase)) + 1;
		int count = 1;
		List<Integer> solveList = testCase;
		while (t != solveList.size()) {
			t = solveList.indexOf(Collections.min(solveList)) + 1;
			solveList = solveList.subList(t, solveList.size());
			count ++;
		}
		System.out.println(count);
	}
}
