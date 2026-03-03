package ch04;

public class Circle3 {
	
	public Circle3(String color, double redius) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.radius = redius;
	}
	
	
	public Circle3() {
		// TODO Auto-generated constructor stub
//		color = "red";
//		radius = 1.0; 
		this("red", 1.0);
	}
	public Circle3(String color) {
		// TODO Auto-generated constructor stub
//		this.color = color;
//		this.radius = 1.0;
		this(color, 1.0);
	}
	public Circle3(double radius) {
		// TODO Auto-generated constructor stub
//		this.color = "red";
//		this.radius = radius;
		this("red", radius); //기존에 생성한 하나의 생성자를 호출해서 사용 가능, 단 생성자는 제일 먼저 호출 한 뒤 this.radius = 5.0; 이런식으로 변경 가능 . 일단 생성자가 제일 먼저 선언되어야 함.   
		
	}
	 
	String color;
	double radius;
	
	void printInfo() {
		System.out.printf("원의 색깔은 %s, 반지름은 %.1f \n", this.color, this.radius);
	}
}
