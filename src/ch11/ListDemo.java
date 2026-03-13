package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//1) new ArrayList 로 생성해서 원소 삽입 삭제 되는지 확인 Set으로 수정 되는지 확인, CRUD
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.get(0);
		list1.set(0, 20);
		list1.remove(0);
		
		//2) Array.asList() => 
		List<Integer> list2 = Arrays.asList(1,2,3);
//		list2.add(10); // java.lang.UnsupportedOperationException
//		list1.get(0);
//		list1.set(0, 20);
//		list1.remove(0);
		
		
		List<Integer> list3 = List.of(1,2,3);
		System.out.println(list3.get(0));
		
		

		List<Integer> list4 = new ArrayList<Integer>(list3);
		// 가변객체(CRUD) ArrayList 를 크기가 고정된 Array로 다시 변환하는 방법
		System.out.println(list4);
//		Integer[] integers = list4.toArray(new Integer(3));
//		System.out.println();
	}
}
