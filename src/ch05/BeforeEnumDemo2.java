package ch05;

public class BeforeEnumDemo2 {
	public static void main(String[] args) { 
		
		Person2 person = new Person2();
		person.age = 20;
		person.gender = Gender2.MALE;
		System.out.println(person.gender + "입니다.");
		System.out.println(person.gender.ordinal() + "입니다.");
		System.out.println(person.gender.name() + "입니다.");
		System.out.println(person.gender.toString() + "입니다.");
	}
}

class Person2{
	int age;
	Gender2 gender; // 0: 남성, 1: 여성
}
// enum 메서드영역의 상수 Pool에 저장 됨. 
enum Gender2 {
    MALE("남성"), FEMALE("여성");

    // 필드
    String s;

    // 생성자
    Gender2(String s) {
        this.s = s;
    }

    // 메서드
    @Override
    public String toString() {
        return s;
    }
} 