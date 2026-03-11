package ch07.practice;

/**
 * Human 인터페이스와 Human 구현 클래스인 Worker가 있다. 
 * Worker 클래스는 이미 다른 프로젝트에서 사용 중이다. 
 * 그런데 Human 인터페이스를 구현한 Student 클래스에는 print() 메서드가 필요하다. 
 * 또 Human 타입으로 사용할 때도 echo() 메서드가 필요하다. 
 * 따라서 다음과 같은 테스트 프로그램을 실행하고자 한다.
 * Human 인터페이스에 수정할 부분이 있으면 수정하고, Student 클래스도 작성하시오. 
 * (단, Worker 클래스는 이미 다른 프로젝트에서 사용 중이므로 수정하면 안되고, 
 * Human과 Student 의 작성 때문에 오류가 나거나 영향을 받으면 안됨)
 */

public class Ex6 {
	public static void main(String[] args) {
		Human.echo();
		Student s = new Student(20);

		s.print();
		s.eat();
		Human p = new Worker();

		p.print();
		p.eat();
	}
}

interface Human {
	void eat() ;
	
	static void echo() {
		System.out.println("야호!!");
	}
	default void print() { 
		System.out.println("인간입니다.");
	}
}

class Worker implements Human {
	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	} 

}
class Student implements Human { 
	int age;
	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	
	public void print() { 
		System.out.println("%d세의 학생입니다.".formatted(age));
	}
	public Student(int age) { 
		this.age = age;
	}
 
} 