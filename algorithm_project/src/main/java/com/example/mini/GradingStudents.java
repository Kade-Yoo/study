package com.example.mini;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

	private static final int MULTIPLE_VALUE = 5;
	private static final int FAIL_GRADE = 38;

	public List<Integer> solveProblem(List<Integer> grades) {
		return grades.stream()
				 .filter(grade -> grade >= 0 && grade <= 100)
				 .map(grade -> resultGrade(grade))
				 .collect(Collectors.toList());
	}

	/**
	 * 
	 * 다음 5의 배수가 38점 이상이면 현재값 반환
	 * 다음 5의 배수에서 현재값을 뺀 나머지가 3보다 작은 경우 5의 배수 반환
	 * 
	 * @param grade
	 * @return 입력 받은 grade의 연산 후 값
	 */
	private Integer resultGrade(Integer grade) {
		int nextMultipleOfFive = ((grade / MULTIPLE_VALUE) + 1) * MULTIPLE_VALUE;
		
		if((nextMultipleOfFive - grade < 3) && nextMultipleOfFive >= FAIL_GRADE) {
			return nextMultipleOfFive;
		}
		return grade;
	}
}
