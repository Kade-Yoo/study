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
	 * �׷����°� �������� �� ��� ��
	 * 
	 * @param �Է� ���� ���� inputYear
	 * @param �׷����� or ������ ���� ���� isLeapYear
	 * @return ���� or ������ �ƴҶ� ��ȯ��
	 */
	@Override
	public String isGregorianOrJulian(int inputYear, boolean isLeapYear) {
		return isLeapYear ? calculateLeapYearResult(inputYear, ProgrammerConstants.LEAP_YEAR) : 
			calculateLeapYearResult(inputYear, ProgrammerConstants.NOT_LEAP_YEAR); 
	}
	
	/**
	 * ����� ��� ��ȯ
	 * 
	 * @param �Է� ���� ���� inputYear
	 * @param ���� �� (����, ������ �ƴҶ�, �Ѵ� �ƴҶ�) fixingValue
	 * @return ����� ���
	 */
	private String calculateLeapYearResult(int inputYear, String fixingValue) {
		return fixingValue + inputYear;
	}
	
}
