package com.example.programmer.service.impl;

import com.example.programmer.LeapYear;
import com.example.programmer.ProgrammerConstants;
import com.example.programmer.service.ProgrammerService;

public class ProgrammerServiceImpl extends LeapYear implements ProgrammerService {

	@Override
	public String calculateLeapYear(int inputYear) {
		if(inputYear < ProgrammerConstants.CONDITION_YEAR) {
			return isGregorianOrJulian(inputYear, checkJulianLeapYearCondition(inputYear)); 
		} else if (inputYear > ProgrammerConstants.CONDITION_YEAR) {
			return isGregorianOrJulian(inputYear, checkGregorianLeapYearCondition(inputYear));
		} 
		
		return calculateLeapYearResult(inputYear,ProgrammerConstants.NEITHER);
	}
	
	/**
	 * 그레고리력과 율리력일 때 계산 값
	 * 
	 * @param 입력 받은 연도 inputYear
	 * @param 그레고리력 or 율리력 윤년 여부 isLeapYear
	 * @return 윤년 or 윤년이 아닐때 반환값
	 */
	@Override
	public String isGregorianOrJulian(int inputYear, boolean isLeapYear) {
		return isLeapYear ? calculateLeapYearResult(inputYear, ProgrammerConstants.LEAP_YEAR) : 
			calculateLeapYearResult(inputYear, ProgrammerConstants.NOT_LEAP_YEAR); 
	}
	
	/**
	 * 계산한 결과 반환
	 * 
	 * @param 입력 받은 연도 inputYear
	 * @param 고정 값 (윤년, 윤년이 아닐때, 둘다 아닐때) fixingValue
	 * @return 계산한 결과
	 */
	private String calculateLeapYearResult(int inputYear, String fixingValue) {
		return fixingValue + inputYear;
	}
	
}
