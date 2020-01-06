package com.example.mini;

public class JumpingKangaroo {
	private static final String YES = "YES";
	private static final String NO = "NO";

	/**
	 * 뛰어라 캥거루
	 * 
	 * 1. 두 캥거루가 +방향으로 점프하기 위해 준비하고 있다. (무한히 앞으로 간다)
	 *	- 첫 번째 캥거루는 x1에서 시작하고 미터 당 v1만큼 점프해 이동한다.
	 *	- 두 번째 캥거루는 x2에서 위치하며 미터 당 v2만큼 점프해 이동한다.
	 * 2. 두 캥거루가 같은 시간, 같은 지점에 위치할 수 있다면 YES, 아니라면 NO
	 * 
	 * @param 1번 캥거루 시작위치 x1
	 * @param 1번 캥거루 보폭 v1
	 * @param 2번 캥거루 시작위치 x2
	 * @param 2번 캥거루 보폭 v2
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
