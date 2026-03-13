package ch11.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 다음 프로그램과 실행 결과를 참고해 Person 클래스와 테스트 프로그램을 작성하시오.
 * • Person 클래스는 이름과 나이를 포함하며, 
 *   이름과 나이를 반환하도록 toString() 메서드를 오버라이딩한다. 
 *   (이름과 나이가 둘 다 같아야 중복 객체라고 한다. 즉, 동명이인 가능)
 * • 객체를 중복 없이 저장하는 HashSet 컬렉션에 Person 객체를 추가한다. 
 *   HashSet은 원소의 중복 여부를 hashCode()와 equals() 메서드를 이용해 판단한다.
 * • 반복자(Iterator)를 사용해 HashSet 컬렉션 원소를 출력한다.
 */
public class Ex2 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20));
		set.add(new Person("우등생", 16));
		set.add(new Person("최고봉", 56));
		set.add(new Person("나자바", 35));
		set.add(new Person("나자바", 25));
		set.add(new Person("나자바", 25));
		
		Iterator<Person> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set);
	}
}