package com.example.catsandmouse;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.catsandmouse.constants.CatsAndMouseConstants;

public class CatsAndMouseTest {
	private CatsAndMouse catsAndMouse;
	
	@Test
	public void solve() {
		int inputPosition[][] = {
				{1, 2, 3},
				{1, 3, 2}
		};
		String answer[] = {CatsAndMouseConstants.CAT_B, CatsAndMouseConstants.MOUSE_C};
		
		for(int index = 0; index < inputPosition.length; index ++) {
			catsAndMouse = new CatsAndMouse(inputPosition[index]);
			assertThat(catsAndMouse.comparePosition()).isEqualTo(answer[index]);
		}
	}
}
