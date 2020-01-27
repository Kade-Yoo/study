package com.example.catsandmouse;

import com.example.catsandmouse.constants.CatsAndMouseConstants;

public class CatsAndMouse {
	private int x;
	private int y;
	private int z;
	
	public CatsAndMouse(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 고양이와 쥐 위치 간 거리 비교
	 * |쥐 C - 고양이 A| == |쥐 C - 고양이 B|
	 * |쥐 C - 고양이 A| > |쥐 C - 고양이 B|
	 * |쥐 C - 고양이 A| < |쥐 C - 고양이 B|
	 * 
	 * @return 고양이 A, 과양이 B, 쥐 C
	 */
	public String compareDistance() {
		int firstSubstractingCatFromMouse = Math.abs(substractCatFromMouse(z, x)); 
		int secondSubstractingCatFromMouse = Math.abs(substractCatFromMouse(z, y)); 
		
		if(firstSubstractingCatFromMouse == secondSubstractingCatFromMouse) {
			return CatsAndMouseConstants.MOUSE_C;
		} else if (firstSubstractingCatFromMouse > secondSubstractingCatFromMouse) {
			return CatsAndMouseConstants.CAT_B;
		} else {
			return CatsAndMouseConstants.CAT_A;
		}
	}

	/**
	 * 고양이와 쥐 사이 거리를 구하는 함수
	 * 
	 * @param 쥐위치 mousePostion
	 * @param 고양이위치 catPosition
	 * @return 거리
	 */
	private int substractCatFromMouse(int mousePosition, int catPosition) {
		return mousePosition - catPosition;
	}
}
