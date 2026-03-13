package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		String[] fruits = {"포도", "사과", "망고", "바나나"};
		List<String> list = Arrays.asList(fruits);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); // Collections.reverseOrder() 기존에 크기 비교가 가능한 객체예야한
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
