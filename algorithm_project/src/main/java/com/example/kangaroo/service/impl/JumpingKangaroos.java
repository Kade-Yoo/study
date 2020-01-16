package com.example.kangaroo.service.impl;

import com.example.kangaroo.constant.KangarooConstant;
import com.example.kangaroo.model.Kangaroo;
import com.example.kangaroo.service.KangarooService;

public class JumpingKangaroos implements KangarooService {
	/**
	 * 뛰어라 캥거루
	 * 
	 * 1. 두 캥거루가 +방향으로 점프하기 위해 준비하고 있다. (무한히 앞으로 간다)
	 *	- 첫 번째 캥거루는 x1에서 시작하고 미터 당 v1만큼 점프해 이동한다.
	 *	- 두 번째 캥거루는 x2에서 위치하며 미터 당 v2만큼 점프해 이동한다.
	 * 2. 두 캥거루가 같은 시간, 같은 지점에 위치할 수 있다면 YES, 아니라면 NO
	 * 3. 1 <= x1 < x2 <= 10000
	 * 4. 1 <= v1 <= 10000
	 * 5. 1 <= v2 <= 10000
	 * 6. 3~5 조합했을 때 추가되는 조건 => v1과 v2가 같을 경우 return "NO" 이유는 x1이 x2보다 항상 작기때문!!
	 * 
	 * @param 1번 캥거루 시작위치 x1
	 * @param 1번 캥거루 보폭 v1
	 * @param 2번 캥거루 시작위치 x2
	 * @param 2번 캥거루 보폭 v2
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
