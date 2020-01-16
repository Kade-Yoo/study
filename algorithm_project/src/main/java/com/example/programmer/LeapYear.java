package com.example.programmer;

public class LeapYear {

	/**
	 * 그레고리력일 때 윤년 검사
	 * 
	 * @param 입력 받은 연도
	 * @return 윤년여부
	 */
	protected boolean checkGregorianLeapYearCondition(int inputYear) {
		if( inputYear % ProgrammerConstants.FOUR_HUNDRED == ProgrammerConstants.ZERO) {
			return true; 
		}
		
		if (inputYear % ProgrammerConstants.FOUR == ProgrammerConstants.ZERO 
				&& inputYear % ProgrammerConstants.HUNDRED != ProgrammerConstants.ZERO) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 율리력일 때 윤년 검사
	 * 
	 * @param 입력 받은 연도
	 * @return 윤년여부
	 */
	protected boolean checkJulianLeapYearCondition(int inputYear) {
		return inputYear % ProgrammerConstants.FOUR == ProgrammerConstants.ZERO ? true : false;
	}
}
