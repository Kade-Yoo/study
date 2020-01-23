package com.example.chocolate;

import java.util.ArrayList;

/**
 * 1. ���ݸ��� �������� �迭�� ��Ÿ�� - ArrayList<Integer> chocolateSegements 
 * 2. Ron�� ���� �� - day
 * 3. Ron�� ���� �� - month
 * 4. ���ݸ� ������ index ~ index + month �����ش�. (index + month < chocolateSegements.size())
 * 5. ������ ���� day�� ���� �� count ����
 * 
 * @author ������
 */
public class BirthdayChocolate {
	private static final Integer ZERO = 0;
	
	private ArrayList<Integer> chocolateSegments;
	private int month;
	private int day;
	
	public BirthdayChocolate(ArrayList<Integer> chocolateSegments, int month, int day) {
		this.chocolateSegments = chocolateSegments;
		this.month = month;
		this.day = day;
	}
	
	/**
	 * �� ��� �� ī��Ʈ ����
	 * 
	 * @return ���� ���� day�� Ƚ��
	 */
	public int calculateChocolateSegments() {
		int sum = ZERO;
		int count = ZERO;
		
		for (int firstIndex = ZERO; this.month + firstIndex <= chocolateSegments.size(); firstIndex++) {
			sum = ZERO;

			for (int secondIndex = firstIndex; secondIndex < firstIndex + this.month; secondIndex++ ) {
				sum = sum + chocolateSegments.get(secondIndex);
			}
			
			if (sum == day) {
				count = count + 1;
			}
		}
		
		return count;
	}
}
