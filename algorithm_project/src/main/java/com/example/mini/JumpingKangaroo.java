package com.example.mini;

public class JumpingKangaroo {
	private static final String YES = "YES";
	private static final String NO = "NO";

	/**
	 * �پ�� Ļ�ŷ�
	 * 
	 * 1. �� Ļ�ŷ簡 +�������� �����ϱ� ���� �غ��ϰ� �ִ�. (������ ������ ����)
	 *	- ù ��° Ļ�ŷ�� x1���� �����ϰ� ���� �� v1��ŭ ������ �̵��Ѵ�.
	 *	- �� ��° Ļ�ŷ�� x2���� ��ġ�ϸ� ���� �� v2��ŭ ������ �̵��Ѵ�.
	 * 2. �� Ļ�ŷ簡 ���� �ð�, ���� ������ ��ġ�� �� �ִٸ� YES, �ƴ϶�� NO
	 * 
	 * @param 1�� Ļ�ŷ� ������ġ x1
	 * @param 1�� Ļ�ŷ� ���� v1
	 * @param 2�� Ļ�ŷ� ������ġ x2
	 * @param 2�� Ļ�ŷ� ���� v2
	 * @return YES or NO
	 */
	public String jumpOnTheGround(int x1, int v1, int x2, int v2) {
		int count = 1;
		while(true) {
			if(secretCondition(v1, v2) == true) {
				return NO;
			}
			
			if( (x2 - x1) < (v1 - v2)*count ) {
				return NO;
			} else if ( (x2 - x1) == (v1 - v2)*count ) {
				return YES;
			}
			
			count++;
		}
	}
	
	private boolean secretCondition(int v1, int v2) {
		if (v1 - v2 == 0) {
			return true;
		}
		return false;
	}
}
