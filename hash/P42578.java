package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 프로그래머스 25816 : 위장
 * 경우의 수 찾기
 * 가능한 경우를 map의 value로 넣어서 곱셈으로 확인
 * todo : stream으로 짜보기
 */
public class P42578 {

	public int solution(String[][] clothes) {
		int answer = 1;

		Map<String, Integer> map = new HashMap<>();
		for (String[] clothe : clothes) {
			map.put(clothe[1], map.getOrDefault(clothe[1], 1) + 1);
		}

		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			answer *= entry.getValue();
		}

		return answer-1;
	}
}
