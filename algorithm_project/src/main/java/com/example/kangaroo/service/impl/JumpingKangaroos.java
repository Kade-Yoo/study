package com.example.kangaroo.service.impl;

import com.example.kangaroo.constant.KangarooConstant;
import com.example.kangaroo.model.Kangaroo;
import com.example.kangaroo.service.KangarooService;

public class JumpingKangaroos implements KangarooService {
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
		if ( validate(firstKangaroo.getDistance(), secondKangaroo.getDistance()) == true) {
			return KangarooConstant.NO;
		} 
		
		if ( jumpKangaroos(firstKangaroo, secondKangaroo) == true ) {
			return KangarooConstant.YES;
		} else {
			return KangarooConstant.NO;
		}
	}

	private boolean validate(int firstKangarooDistance, int secondKangarooDistance) {
		if( firstKangarooDistance == secondKangarooDistance ) {
			return true;
		}
		return false;
	}

	private boolean jumpKangaroos(Kangaroo firstKangaroo, Kangaroo secondKangaroo) {
		int firstKangarooPosition = firstKangaroo.getPosition();
		int secondKangarooPosition = secondKangaroo.getPosition();
		
		while(firstKangarooPosition < secondKangarooPosition) {
			firstKangarooPosition = firstKangarooPosition + firstKangaroo.getDistance();
			secondKangarooPosition = secondKangarooPosition + secondKangaroo.getDistance();
			
			return firstKangarooPosition == secondKangarooPosition ? true : false;
		}
		
		return false;
	}
}
