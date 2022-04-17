package stackqueue;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P42586Test {

	P42586 p42586 = new P42586();

	@Test
	void 기능개발_테스트1() {
		//[93, 30, 55] 7일 3일 9일
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};

		List<Integer> result = p42586.solution(progresses, speeds);

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		Assertions.assertThat(result).usingRecursiveComparison().isEqualTo(list);
	}


	@Test
	void 기능개발_테스트2() {
		//[95, 90, 99, 99, 80, 99]  5일, 10일, 1일, 1일, 20일, 1일
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};

		List<Integer> result = p42586.solution(progresses, speeds);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		Assertions.assertThat(result).usingRecursiveComparison().isEqualTo(list);
	}
}