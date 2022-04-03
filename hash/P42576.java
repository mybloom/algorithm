package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 문제 : 프로그래머스 42576 완주하지 못한 선수 
 * 유형 : 중복 확인 
 * 풀이방법 : 중복은 정렬과 hash값을 이용해서 풀이할 수 있는데,
 직접 hash값을 비교하는 것 대신
 자바에서 제공하는 hashMap 자료구조를 이용해 해당 key의 value를 확인하여 중복여부를 판단한다.
 */
public class P42576 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}

		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
		}

		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			if (entry.getValue() >= 1) {
				answer = entry.getKey();
				break;
			}
		}

		return answer;
	}
}
