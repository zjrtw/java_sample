package ch05;

public class BeforeEnumDemo {
	public static void main(String[] args) {
		final int MALE = 0;
		final int FEMALE = 1;
		
		Person person = new Person();
		person.age = 20;
		person.gender = MALE;
		if (person.gender == MALE) {
			System.out.println("남성입니다.");
		} else { 
			System.out.println("여성입니다.");
		}
		

		final int EAST = 1;
		final int WEST = 2;
		
		System.out.println(Direction.EAST);
		 
		person.gender = EAST;
		if (person.gender == MALE) {
			System.out.println("남성입니다.");
		} else { 
			System.out.println("여성입니다.");
		}
	}
}

class Person{
	int age;
	int gender; // 0: 남성, 1: 여성
}


// enum 메서드영역의 상수 Pool에 저장 됨. 
enum Gender {
	MALE, FEMALE
}

enum Direction {
	EAST, WEST, SOUTH, NORTH
}
