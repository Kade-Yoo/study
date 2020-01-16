package com.example.programmer;

public abstract class LeapYear {

	/**
	 * �׷������� �� ���� �˻�
	 * 
	 * @param �Է� ���� ����
	 * @return ���⿩��
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
	 * �������� �� ���� �˻�
	 * 
	 * @param �Է� ���� ����
	 * @return ���⿩��
	 */
	protected boolean checkJulianLeapYearCondition(int inputYear) {
		return inputYear % ProgrammerConstants.FOUR == ProgrammerConstants.ZERO ? true : false;
	}
	
	/**
	 * �׷����°� �������� �� ��� ��
	 * 
	 * @param �Է� ���� ���� inputYear
	 * @param �׷����� or ������ ���� ���� isLeapYear
	 */
	public abstract String isGregorianOrJulian(int inputYear, boolean isLeapYear);
}
