package hash;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P42576Test {

	P42576 p42576 = new P42576();

	@Test
	void 완주하지못한선수1() {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		String result = p42576.solution(participant,completion);

		Assertions.assertThat(result).isEqualTo("leo");
	}

	@Test
	void 완주하지못한선수2() {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};

		String result = p42576.solution(participant,completion);

		Assertions.assertThat(result).isEqualTo("vinko");
	}
	
	@Test
	void 완주하지못한선수_중복된이름() {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};

		String result = p42576.solution(participant,completion);

		Assertions.assertThat(result).isEqualTo("mislav");
	}

}