package com.example.mini;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KangarooTest {
	
	private JumpingKangaroo jumpingKangaroo = new JumpingKangaroo();
	
	@Test
	void solve() {
		assertThat(jumpingKangaroo.jumpOnTheGround(0, 3, 4, 2)).isEqualTo("YES");
	}
}
