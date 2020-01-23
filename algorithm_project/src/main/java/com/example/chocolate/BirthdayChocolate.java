package com.example.chocolate;

import java.util.ArrayList;

/**
 * 1. 초콜릿의 조각들을 배열로 나타냄 - ArrayList<Integer> chocolateSegements 
 * 2. Ron의 생일 일 - day
 * 3. Ron의 생일 달 - month
 * 4. 초콜릿 조각을 index ~ index + month 더해준다. (index + month < chocolateSegements.size())
 * 5. 더해준 값이 day와 같을 때 count 증가
 * 
 * @author 유형민
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
	 * 합 계산 후 카운트 증가
	 * 
	 * @return 더한 값이 day인 횟수
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
