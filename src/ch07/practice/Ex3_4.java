package ch07.practice;

import java.util.Arrays;
import java.util.Collections;

/**
 * 나이 순서대로 정렬할 수 있는 Person 클래스와 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하시오. 
 * Person 클래스에는 int 타입의 age, height, weight 필드, String 타입의 name이 있으며, 
 * 생성자와 필요한 메서드를 포함한다. 
 * 또 테스트 프로그램은 3개의 Person 객체로 구성된 Person 배열을 사용해 
 * 나이 순서대로(연장자가 먼저 출력됨, 내림차순) 정렬한 후 출력한다.
 * 
 * 힌트 : 배열을 내림차순 정렬하려면 ? compareTo 의 리턴값 활용, 혹은 기본 Arrays.sort 후 리버스
 */

class Person implements Comparable {
	int age, height, weight;
	String name;
	public Person(String name, int age, int height, int weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if( o instanceof Person p)
			return p.age - this.age;
		return -9999;
	}
	public String toString() {
		return "Person [이름=\"%s\", 나이=%d, 키=%d, 몸무게=%d]".formatted(name, age, height, weight);
	}
	
	
}
public class Ex3_4 {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("박지성", 40,175,68);
		persons[1] = new Person("홍길동", 32,170,75);
		persons[2] = new Person("손흥민", 20,180,70);
		
		Arrays.sort(persons);
//		Arrays.sort(persons, Comparator.reverseOrder());
 
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}

