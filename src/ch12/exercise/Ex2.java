package ch12.exercise;

import java.util.stream.Stream;

public class Ex2 {
	public static void main(String[] args) {
		Stream.of("a1", "a2", "a3")
			.map(s -> s.substring(1)) // 뒤에 숫자만 자르고 
			.mapToInt(Integer::parseInt) // int 로 변환 후 
			.max() // 제일 큰 숫자 구하기 => 3 
			.ifPresent(System.out::println); // 3 출력
	}
}
