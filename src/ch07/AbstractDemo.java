package ch07;

public class AbstractDemo {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[3]; 
		circles[0] = new Circle(); 
		
		
		// 위와같이 일일이 같은 객체를 생성해서 작업 할 필요없이 아래처럼 하나에 넣고 호출 가능
		 
		Shape[] shapes = new Shape[3]; 
		shapes[1] = new Circle();
		
		for (Shape shape : shapes) {
			shape.area();
		}
		
		// Ex2. 다형성 - 매개변수 -> 매개변수 타입에 맞춰서 일일이 오버로딩 해줘야 함. 
		Circle circle = new Circle(); 
		
		drawShape(circle);
		
	}
	
//	// 이런식으로 일일이 오버로딩을 해야 함. 
//	static private void drawShape(Circle2 c) {
//		// TODO Auto-generated method stub
//	}
//	static private void drawShape(Triangle t) {
//		// TODO Auto-generated method stub
//	}
	
	// 이거 하나로 다 커버 가능
	static private void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		
//		shape.setRadius(5); // 사용 불가
		
		// 특정 자식에게 있는 기능을 사용하고 싶음 넘어온 자식 타입을 확인 
		if(shape instanceof Circle ) {
			Circle circle = (Circle) shape; // 자식타입으로 다운캐스팅 , 명시적 강제 형변환 
			circle.setRadius(5);
			circle.draw();
		}
	}
	
}

abstract class Shape{
	abstract void draw(); // 추상메서드 -> 자식 클래스에서 반드시 구현해야 함.
	public void area() { // 일반메서드
		System.out.println("도형의 넓이");
	}
}

class Circle extends Shape{
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
	
	@Override
	public void area() {
		System.out.println("원의 넓이");
	} 
} 

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
		
	}
	
}