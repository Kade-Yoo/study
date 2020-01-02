package com.example.mini;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

	private static final int MULTIPLE_VALUE = 5;

	public List<Integer> solveProblem(List<Integer> grades) {
		return grades.stream()
				 // 0~100 사이
				 .filter(grade -> grade >= 0 && grade <= 100)
				 .map(grade -> resultGrade(grade))
				 .collect(Collectors.toList());
	}

	// 결과값 출력
	private Integer resultGrade(Integer grade) {
//		if (grade % MULTIPLE_VALUE < 3)
		int conditionGrade = ((grade / MULTIPLE_VALUE) + 1)*MULTIPLE_VALUE; 
		
		if (conditionGrade < 40) 
		// 다음 5의 배수가 40점 미만 이면 변환 안함
		// 다음 5의 배수에서 현재값을 뺏을 때 3보다 작은 경우
		if((conditionGrade - grade < 3) && conditionGrade >= 40) {
			return conditionGrade;
		}
		return grade;
	}
}
