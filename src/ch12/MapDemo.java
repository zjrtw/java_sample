package ch12;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class MapDemo {
	public static void main(String[] args) {
		String[] sa = {"a", "b", "c", "d", "e"};
		
		Arrays.stream(sa) // Stream<String>
			.map(String::toUpperCase) // 인스턴스 메시지 참조
			.forEach(Util::print);  // Util 클래스의 static 메서드 참조
		
		System.out.println();
		
		Integer[] ia = {1,2,3,4,5};
		Arrays.stream(ia)
			.map(i -> i*2)
			.forEach(Util::print);

		System.out.println();
		// 1. 각 원소의 두번째 글자만 잘라낸다. 
		// 2. 문자열을 숫자로 변환해서 스트림으로 반환한다.
		// 3. 출력한다. 
		String[] sa1 = {"a1", "b1", "c2", "d3", "e4"}; 
		Arrays.stream(sa1)
			.map(s -> s.substring(1)) // 다른 값(1) 이 있으므로 참조메서드로 불가
			.mapToInt(Integer::parseInt) // 문자를 숫자로 변환
			.forEach(Util::print);

		System.out.println();
		// 1. 각 원소의 두번째 글자만 잘라낸다. 
		// 2. 문자열을 숫자로 변환해서 스트림으로 반환한다.
		// 2-1. 숫자 스크림을 다시 문자열 스트림으로 반환한다. "s" + 1
		// 3. 출력한다. 
		String[] sa2 = {"a1", "b1", "c2", "d3", "e4"}; 
		Arrays.stream(sa2)
			.map(s -> s.substring(1)) // 다른 값(1) 이 있으므로 참조메서드로 불가
			.mapToInt(Integer::parseInt) // 문자를 숫자로 변환
			.mapToObj(i ->  "s" + i)
			.forEach(Util::print);
		
		System.out.println();
		// null 고려해서 Optional로 감싼다. 
		OptionalDouble od = Nation.nations.stream()
			.mapToDouble(n-> n.getPopulation())
			.max(); // 최종연산
		if(od.isPresent()) {
			System.out.println(od.getAsDouble());
		}
		
	}
}
