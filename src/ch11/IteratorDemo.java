package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	public static void main(String[] args) {
		// 1. SOLID의 원칙 중 의존관계 역전 원칙(Dependency Inversion Principle)을 지키지 않은 예
		// 구체적인 객체에 의존 할 때 다른 객체로 변환시 문제 발생
		LinkedList<Integer> list = new LinkedList(); // 이걸 ArrayList로 변환하면 
//		ArrayList<Integer> list = new ArrayList();  // addFirst가 없기에 에러 발생함
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		System.out.println(list);
		
		// 1. SOLID의 원칙 중 의존관계 역전 원칙(Dependency Inversion Principle)을 지킨 예
//		Collection<String> list1 = new LinkedList(); // 이걸 ArrayList로 변환해도 덜 구체적인 Collection<String> 상위 요소에 담았기에 (결합도를 낮춤)
		Collection<String> list1 = new ArrayList();  // 문제가 발생하지 않음
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		// 문자열 3개를 가지는 고정 크기 리스트 생성
		Collection<String> list2 = Arrays.asList("다람쥐", "개구리", "나비");

		// 리스트를 순회하기 위한 Iterator 객체 생성
		// Iterator는 컬렉션을 한 요소씩 꺼내며 이동하는 반복자 객체
		Iterator<String> iterator = list2.iterator();
//		System.out.println(iterator.hasNext());


		// Iterator를 이용한 반복문
		// hasNext() : 다음 요소가 있으면 true, 없으면 false
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //next() : 현재 위치의 요소를 반환하고 다음 위치로 이동
		}


		// 다시 Iterator를 새로 생성 (처음 위치로 초기화)
		iterator = list2.iterator();

		// next() : 현재 위치의 요소를 반환하고 다음 위치로 이동
		// 새로 생성된 iterator이므로 첫 번째 요소인 "다람쥐"가 출력됨
		System.out.println(iterator.next());
	}
}
