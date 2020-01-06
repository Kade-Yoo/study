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
	 * ���� 5�� ����� 38�� �̻��̸� ���簪 ��ȯ
	 * ���� 5�� ������� ���簪�� �� �������� 3���� ���� ��� 5�� ��� ��ȯ
	 * 
	 * @param grade
	 * @return �Է� ���� grade�� ���� �� ��
	 */
	private Integer resultGrade(Integer grade) {
		int nextMultipleOfFive = ((grade / MULTIPLE_VALUE) + 1) * MULTIPLE_VALUE;
		
		if((nextMultipleOfFive - grade < 3) && nextMultipleOfFive >= FAIL_GRADE) {
			return nextMultipleOfFive;
		}
		return grade;
	}
}
