package com.example.kangaroo.service.impl;

import com.example.kangaroo.model.Kangaroo;
import com.example.kangaroo.service.KangarooService;

public class KangarooServiceImpl implements KangarooService {
	private static final String YES = "YES";
	private static final String NO = "NO";

	/**
	 * �پ�� Ļ�ŷ�
	 * 
	 * 1. �� Ļ�ŷ簡 +�������� �����ϱ� ���� �غ��ϰ� �ִ�. (������ ������ ����)
	 *	- ù ��° Ļ�ŷ�� x1���� �����ϰ� ���� �� v1��ŭ ������ �̵��Ѵ�.
	 *	- �� ��° Ļ�ŷ�� x2���� ��ġ�ϸ� ���� �� v2��ŭ ������ �̵��Ѵ�.
	 * 2. �� Ļ�ŷ簡 ���� �ð�, ���� ������ ��ġ�� �� �ִٸ� YES, �ƴ϶�� NO
	 * 3. 1 <= x1 < x2 <= 10000
	 * 4. 1 <= v1 <= 10000
	 * 5. 1 <= v2 <= 10000
	 * 6. 3~5 �������� �� �߰��Ǵ� ���� => v1�� v2�� ���� ��� return "NO" ������ x1�� x2���� �׻� �۱⶧��!!
	 * 
	 * @param 1�� Ļ�ŷ� ������ġ x1
	 * @param 1�� Ļ�ŷ� ���� v1
	 * @param 2�� Ļ�ŷ� ������ġ x2
	 * @param 2�� Ļ�ŷ� ���� v2
	 * @return YES or NO
	 */
	
	@Override
	public String jumpKangaroo(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
		int count = 1;
		
		if( secretCondition(firstKangaroo.getDistance() , secondKangaroo.getDistance() ) == true ) {
			return NO;
		}
		
		while(true) {
			int firstKangarooPosition = (firstKangaroo.getPosition() + firstKangaroo.getDistance())*count;
			int secondKangarooPosition = (secondKangaroo.getPosition() + secondKangaroo.getDistance())*count;
			
			if( majorCondition(firstKangarooPosition, secondKangarooPosition) ) {
				return NO;
			} else {
				return YES;
			}
			
			count++;
		}
		
		return null;
	}
	
	// �� �κи� �ٽ� ¥���................
	private boolean majorCondition(int firstPosition, int secondPosition) {
		if( firstPosition > secondPosition ) {
			return false;
		} else if (firstPosition == secondPosition) {
			return true;
		}
	}
	
	private boolean secretCondition(int v1, int v2) {
		if (v1 == v2) {
			return true;
		}
		return false;
	}
}
