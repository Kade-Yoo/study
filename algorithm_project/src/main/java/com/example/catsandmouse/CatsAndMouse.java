package com.example.catsandmouse;

import com.example.catsandmouse.constants.CatsAndMouseConstants;

public class CatsAndMouse {
	private int[] position;
	
	public CatsAndMouse(int[] position) {
		this.position = position;
	}

	public String comparePosition() {
		int firstCatFromMouseSubstraction = Math.abs(substractCatFromMouse(position[2], position[0])); 
		int secondCatFromMouseSubstraction = Math.abs(substractCatFromMouse(position[2], position[1])); 
		
		if(firstCatFromMouseSubstraction == secondCatFromMouseSubstraction) {
			return CatsAndMouseConstants.MOUSE_C;
		} else if (firstCatFromMouseSubstraction > secondCatFromMouseSubstraction) {
			return CatsAndMouseConstants.CAT_B;
		} else {
			return CatsAndMouseConstants.CAT_A;
		}
	}

	private int substractCatFromMouse(int mousePosition, int catPosition) {
		return mousePosition - catPosition;
	}
}
