package com.example.chocolate;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class BirthdayChocolateTest {
	private BirthdayChocolate birthday;
	
	@Test
	public void solve() {
		int month = 2;
		int day = 3;
		ArrayList<Integer> chocolateSegments = new ArrayList();

		chocolateSegments.add(1);
		chocolateSegments.add(2);
		chocolateSegments.add(1);
		chocolateSegments.add(3);
		chocolateSegments.add(2);
		
		birthday = new BirthdayChocolate(chocolateSegments, month, day);
		
		assertThat(birthday.calculateChocolateSegments()).isEqualTo(2);
	}
}
