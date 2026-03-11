package ch06;

/**
 * 다음 표와 실행 결과를 참고해서 답하시오. 
 * show() 메서드는 객체의 정보를 문자열로 반환한다.
 * 1. Person, Person의 자식 Student, Student의 자식 ForeignStudent를 클래스로 작성한다.
 * 2. Person 타입 배열이 Person, Student, ForeignStudent 타입의 객체를 1개씩 포함하며,
 * Person 타입 배열 원소를 for~each 문을 사용해 각 원소의 정보를 다음과 같이 출력하도록
테스트 프로그램을 작성하시오.
 */
public class Practice03 {
	
//	public static void main(String[] args) { 
//		Person p = new Person("길동이", 22);
//		Person s = new Student("황진이", 23, 100);
//		Person f = new ForeignStudent("Amy", 30, 200, "U.S.A");
//		
//		p.show();
//		s.show();
//		f.show();
//	}
	
	public static void main(String[] args) { 
		Person[] persons = new Person[3];
		persons[0] = new Person("길동이", 22);
		persons[1] = new Student("황진이", 23, 100);
		persons[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for (Person person : persons) {
			person.show();
		} 
	}

}

class Person{ // 부모 클래스
	//필드
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 모든 필드를 초기화 하는 생성자
	public Person() {
		this(null, 0);
	}
	// 접근자 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 메서드
	void show() {
		System.out.println(String.format("사람[이름 : %s, 나이 : %d]", name, age));
	}
}

class Student extends Person{
	//필드
	private int studentId; //학번

	//생성자
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	// 접근자 
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	// 메서드 
	void show() {
		System.out.println(String.format("사람[이름 : %s, 나이 : %d, 학번 : %d]", super.getName(), super.getAge(), studentId));
	}
}

class ForeignStudent extends Student{
	//필드
	String nationality;

	//생성자
	public ForeignStudent(String name, int age, int studentId, String nationality) {
		super(name, age, studentId);
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}  
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	// 메서드  
	void show1() {
		System.out.println(String.format("사람[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]", super.getName(), super.getAge(), super.getStudentId(), nationality));
	}
	 
}

