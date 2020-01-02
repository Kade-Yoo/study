package com.example.mini;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

	private static final int MULTIPLE_VALUE = 5;

	public List<Integer> solveProblem(List<Integer> grades) {
		return grades.stream()
				 // 0~100 ����
				 .filter(grade -> grade >= 0 && grade <= 100)
				 .map(grade -> resultGrade(grade))
				 .collect(Collectors.toList());
	}

	// ����� ���
	private Integer resultGrade(Integer grade) {
//		if (grade % MULTIPLE_VALUE < 3)
		int conditionGrade = ((grade / MULTIPLE_VALUE) + 1)*MULTIPLE_VALUE; 
		
		if (conditionGrade < 40) 
		// ���� 5�� ����� 40�� �̸� �̸� ��ȯ ����
		// ���� 5�� ������� ���簪�� ���� �� 3���� ���� ���
		if((conditionGrade - grade < 3) && conditionGrade >= 40) {
			return conditionGrade;
		}
		return grade;
	}
}
