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
	
	// �ʱ�ȭ
	public BirthdayChocolate(ArrayList<Integer> chocolateSegments, int month, int day) {
		this.chocolateSegments = chocolateSegments;
		this.month = month;
		this.day = day;
	}
	
	/**
	 * sum == day �� �� ī��Ʈ ����
	 * 
	 * @return ���� ���� day�� Ƚ��
	 */
	public int calculateChocolateSegments() {
		int count = ZERO;
		
		// sum �ʱ�ȭ �ϴ� ������ ���̱� ���� for���� �� �Լ��� ��������.
		for (int firstIndex = ZERO; this.month + firstIndex <= chocolateSegments.size(); firstIndex++) {
			if (calculateSecondCondition(firstIndex) == day) {
				count = count + 1;
			}
		}
		
		return count;
	}
	
	/**
	 * �� ��� 
	 * ( 0 ~ 0 + month , 1 ~ 1 + month , 2 ~ 2 + month .... n + n + month )
	 * segemnts.get(0) ... + segemnts.get(0 + month) 
	 * , segemnts.get(1) ... + segemnts.get(1 + month)
	 * , segemnts.get(n) ... + segemnts.get(n + month) 
	 * 
	 * @return ���ݸ� segment�� ���� ��
	 */
	private int calculateSecondCondition(int firstIndex) {
		int sum = ZERO;
		
		for(int secondIndex = firstIndex; secondIndex < firstIndex + this.month; secondIndex++) {
			sum = sum + chocolateSegments.get(secondIndex);
		}
		
		return sum;
	}
}
