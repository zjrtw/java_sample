package ch08.practice;

import java.text.MessageFormat;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println(new Student("김삿갓"));
		System.out.println(new Student("홍길동"));
	}
}
class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return MessageFormat.format("학생[{0}]", name);
	}
}
