package stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 프로그래머스 25816 : 위장
	//[93, 30, 55] [7일 3일 9일]
	//[95, 90, 99, 99, 80, 99]   [5일, 10일, 1일, 1일, 20일, 1일]
	* [5일, 10일, 1일, 1일, 20일, 1일] 를 queue로 생각하고 풀었음. 큐의 집합은 큰 수가 나올 때까지로 생각.
	* 느낀점 : list, array간 변환, 자바에서 list등의 자료구조를 잘 사용하는 방법을 익혀야겠다.
	* 두번째 풀이
		- ArrayList를 큐처럼 사용했는데, 자바의 Queue자료형을 사용해보고 for문 한번에 처리해보자.
 */
public class P42586 {

	public List<Integer> solution(int[] progresses, int[] speeds) {

		Queue<Integer> queue = new LinkedList();
		List<Integer> answerList = new ArrayList<>();
		//[93, 30, 55] {1, 30, 5};  [7일 3일 9일]
		for (int i = 0; i < progresses.length; i++) {
			int numberOfDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

			if (!queue.isEmpty() && queue.peek() - numberOfDays < 0) {
				answerList.add(queue.size());
				queue.clear();
			}

			queue.offer(numberOfDays);
		}
		answerList.add(queue.size());

		return answerList;
	}

	public List<Integer> solution1St(int[] progresses, int[] speeds) {

		//1. 100보다 같거나 클때가 될때까지 걸리는 x값
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			double sum = 100.0 - progresses[i];
			double quotient = sum / speeds[i];

			list.add((int) Math.ceil(quotient));
		}

		//2. x값보다 작은 수의 갯수
		int count = 0;
		int first = 0; //queue의 시작 index
		int valueOfFist = list.get(first);
		List<Integer> answerList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (valueOfFist >= list.get(i)) {
				count++;
				continue;
			}
			answerList.add(count);
			first = i;
			valueOfFist = list.get(i);
			count = 0;
			count++;
		}
		answerList.add(count);

		return answerList;
	}
}
