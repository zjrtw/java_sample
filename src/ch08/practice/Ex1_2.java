package ch08.practice;

import java.util.Objects;

public class Ex1_2 {
	public static void main(String[] args) {
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123456", "손흥민");
		if(p1.equals(p2))
			System.out.println("같은 사람이다.");
		else
			System.out.println("다른 사람이다.");

		if(p2.equals(p3))
			System.out.println("같은 사람이다.");
		else
			System.out.println("다른 사람이다.");
	}
}
class Person  {
	String id;
	String name;
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	} 
	@Override
	public boolean equals (Object o) {
		if (o instanceof Person p) {
			return p.hashCode() == this.hashCode();
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}