package ch12;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 비어있는 리스트
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("list : " + list);
		
		List<Integer> gt5list = new ArrayList<>(); // 비어있는 리스트
		for (int i = 0; i < list.size(); i++) {
			int tmp = list.get(i);
			if(tmp > 5) gt5list.add(tmp);			
		}
		System.out.println("gt5list : " + gt5list);
		
		List<Integer> evenlist = new ArrayList<>(); // 비어있는 리스트
		for (int i = 0; i < gt5list.size(); i++) {
			int tmp = gt5list.get(i);
			if(tmp % 2 == 0) evenlist.add(tmp);			
		}
		System.out.println("evenlist : " + evenlist);

		System.out.println("스트림 > " );
		// 위의 로직을 한 줄로 표현 가능
		// filter에는 boolean을 반환하는 Predicate을 구현하고, forEach는 Consumer를 구현하면 된다. 
		list.stream().filter(i -> i > 5).filter(i -> i%2 == 0).forEach(i -> System.out.println(i));
		
		System.out.println("스트림 + 메서드참조 > " );
		// forEach는 메소드 참조로 구현 다른건 메서드가 아니라 산식이라 참조 불가
		list.stream().filter(i -> i > 5).filter(i -> i%2 == 0).forEach(System.out::println);
	
	}
}
