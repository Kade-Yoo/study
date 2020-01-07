package com.example.mini;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kangaroo.service.impl.KangarooServiceImpl;

@SpringBootTest
public class KangarooTest {
	
	private KangarooServiceImpl jumpingKangaroo = new KangarooServiceImpl();
	
	@Test
	void solve() {
		assertThat(jumpingKangaroo.jumpKangaroo(firstKangaroo, secondKangaroo)).isEqualTo("YES");
	}
}
