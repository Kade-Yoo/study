package com.example.mini;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kangaroo.factory.KangarooSingleton;
import com.example.kangaroo.model.Kangaroo;
import com.example.kangaroo.service.KangarooService;

@SpringBootTest
public class KangarooTest {
	
	private KangarooService jumpingKangaroo = KangarooSingleton.getInstance();
	
	@Test
	void solve() {
		Kangaroo firstKangaroo = new Kangaroo();
		firstKangaroo.setPosition(0);
		firstKangaroo.setDistance(3);
		
		Kangaroo secondKangaroo = new Kangaroo();
		secondKangaroo.setPosition(4);
		secondKangaroo.setDistance(2);
		
		assertThat(jumpingKangaroo.jumpKangaroo(firstKangaroo, secondKangaroo)).isEqualTo("YES");
	}
	
	@Test
	void secondSolve() {
		Kangaroo firstKangaroo = new Kangaroo();
		firstKangaroo.setPosition(0);
		firstKangaroo.setDistance(1);
		
		Kangaroo secondKangaroo = new Kangaroo();
		secondKangaroo.setPosition(1);
		secondKangaroo.setDistance(2);
		
		assertThat(jumpingKangaroo.jumpKangaroo(firstKangaroo, secondKangaroo)).isEqualTo("NO");
	}
}
