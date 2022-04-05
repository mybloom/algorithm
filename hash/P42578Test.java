package hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P42578Test {

	P42578 p42578 = new P42578();

	@Test
	void Headgear2종류_eyewear1종류() {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"},
			{"green_turban", "headgear"}};

		int result = p42578.solution(clothes);

		assertThat(result).isEqualTo(5);
	}

	@Test
	void face3종류() {
		String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"},
			{"smoky_makeup", "face"}};

		int result = p42578.solution(clothes);

		assertThat(result).isEqualTo(3);
	}

}