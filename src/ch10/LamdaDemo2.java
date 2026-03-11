package ch10;

import java.util.*;

public class LamdaDemo2 {
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("b", "c", "a", "d");
		 System.out.println(list);
		 Collections.sort(list); // 오름차순으로 정렬
		 System.out.println(list);
		 
		// 내림차순으로 정렬 
		 Collections.sort(list, new Comparator<String>() {
			 @Override
			 public int compare(String o1, String o2) {
				 return o2.compareTo(o1);
			 }
		});
		System.out.println(list); 
 
		// 람다식으로 줄이기 Comparator 함수형 인터페이스의 구현체인 람다를 활용
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2)); // 오름차순으로 되도록
		System.out.println(list);
	}
}
  