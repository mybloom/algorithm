package hash;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 * 같은 전화번호가 중복해서 들어있지 않습니다.
 */
class P42577Test {

	P42577 p42577 = new P42577();

	@Test
	void 전화번호가_다른번호의_접두어인경우1_false(){
		String[] phone_book = {"119", "97674223", "1195524421"};

		boolean result = p42577.solution(phone_book);

		assertThat(result).isFalse();
	}

	@Test
	void 전화번호가_다른번호의_접두어가_아닌경우_true(){
		String[] phone_book = {"123","456","789"};

		boolean result = p42577.solution(phone_book);

		assertThat(result).isTrue();
	}

	@Test
	void 전화번호가_다른번호의_접두어인경우2_false(){
		String[] phone_book = {"12","123","1235","567","88"};

		boolean result = p42577.solution(phone_book);

		assertThat(result).isFalse();
	}

}