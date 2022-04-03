package hash;

import java.util.Arrays;

public class P42577 {

	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (String s : phone_book) {
			System.out.print(s+",");
		}
		System.out.println();

		for (int i = 0; i < phone_book.length -1 ; i++) {
			if (phone_book[i+1].length() > phone_book[i].length()){
				if(phone_book[i+1].startsWith(phone_book[i])){
					answer = false;
					break;
				}
			}
		}

		return answer;
	}
}
