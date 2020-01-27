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
	 * ����̿� �� ��ġ �� �Ÿ� ��
	 * |�� C - ����� A| == |�� C - ����� B|
	 * |�� C - ����� A| > |�� C - ����� B|
	 * |�� C - ����� A| < |�� C - ����� B|
	 * 
	 * @return ����� A, ������ B, �� C
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
	 * ����̿� �� ���� �Ÿ��� ���ϴ� �Լ�
	 * 
	 * @param ����ġ mousePostion
	 * @param �������ġ catPosition
	 * @return �Ÿ�
	 */
	private int substractCatFromMouse(int mousePosition, int catPosition) {
		return mousePosition - catPosition;
	}
}
