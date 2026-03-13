package ch11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList를 이용해 '갈매기', '나비', '다람쥐', '라마'를 원소로 입력한 후 각 원소에서
문자열 크기가 2인 단어만 출력하는 프로그램을 작성하시오.
1. ArrayList 선언
2. Add 함수로 '동물' 추가
3. for-each문과 if 조건문으로 문자열의 길이가 2인 동물만 출력!
 */
public class EX1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		
		for (String string : list) {
			if(string.length() == 2) {
				System.out.println(string);
			}
		}
		
		list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

		
	}

}
