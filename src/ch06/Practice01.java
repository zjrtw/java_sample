package ch06;

public class Practice01 {

	public static void main(String[] args) {
		/* TODO 다음 표와 실행 결과를 참고해 부모 클래스인 Circle1과 자식클래스인 ColoredCircle1을
		작성하시오. 그리고 Circle1과 ColoredCircle1 객체의 show() 메서드를 호출하는 테스트
		프로그램도 작성하시오.*/
		ColoredCircle1 c = new ColoredCircle1(5, "파란");
		c.show();
	}

}

class Circle1{
	int radius;
	
	public Circle1(int radius) {
		this.radius = radius;
	}
	
	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}

class ColoredCircle1 extends Circle1{
	String color;

	public ColoredCircle1(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}
}