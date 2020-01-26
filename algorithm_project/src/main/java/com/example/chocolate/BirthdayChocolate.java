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
	
	// 초기화
	public BirthdayChocolate(ArrayList<Integer> chocolateSegments, int month, int day) {
		this.chocolateSegments = chocolateSegments;
		this.month = month;
		this.day = day;
	}
	
	/**
	 * sum == day 일 때 카운트 증가
	 * 
	 * @return 더한 값이 day인 횟수
	 */
	public int calculateChocolateSegments() {
		int count = ZERO;
		
		// sum 초기화 하는 로직을 줄이기 위해 for문을 각 함수로 나누었다.
		for (int firstIndex = ZERO; this.month + firstIndex <= chocolateSegments.size(); firstIndex++) {
			if (calculateSecondCondition(firstIndex) == day) {
				count = count + 1;
			}
		}
		
		return count;
	}
	
	/**
	 * 합 계산 
	 * ( 0 ~ 0 + month , 1 ~ 1 + month , 2 ~ 2 + month .... n + n + month )
	 * segemnts.get(0) ... + segemnts.get(0 + month) 
	 * , segemnts.get(1) ... + segemnts.get(1 + month)
	 * , segemnts.get(n) ... + segemnts.get(n + month) 
	 * 
	 * @return 초콜릿 segment를 더한 값
	 */
	private int calculateSecondCondition(int firstIndex) {
		int sum = ZERO;
		
		for(int secondIndex = firstIndex; secondIndex < firstIndex + this.month; secondIndex++) {
			sum = sum + chocolateSegments.get(secondIndex);
		}
		
		return sum;
	}
}
