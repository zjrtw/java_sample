package ch06;

public class UpcastingDemo {
	public static void main(String[] args) {
		
		Circle2[] circles = new Circle2[3]; 
		circles[0] = new Circle2(); 
		
		Triangle[] triangles = new Triangle[3]; 
		triangles[0] = new Triangle(); 
		
		// 위와같이 일일이 같은 객체를 생성해서 작업 할 필요없이 아래처럼 하나에 넣고 호출 가능
		 
		Shape[] shapes = new Shape[3]; 
		shapes[0] = new Shape();
		shapes[1] = new Circle2();
		shapes[2] = new Triangle();
		
		for (Shape shape : shapes) {
			shape.area();
		}
		
		// Ex2. 다형성 - 매개변수 -> 매개변수 타입에 맞춰서 일일이 오버로딩 해줘야 함. 
		Circle2 circle = new Circle2(); 
		Triangle triangle = new Triangle(); 
		
		drawShape(circle);
		drawShape(triangle);
		
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
		if(shape instanceof Circle2 ) {
			Circle2 circle = (Circle2) shape; // 자식타입으로 다운캐스팅 , 명시적 강제 형변환 
			circle.setRadius(5);
			circle.draw();
		} else if (shape instanceof Triangle t) {// 이렇게 축약도 가능
			t.setBase(5);
			t.setHeight(10);
		}
	}
	
}

class Shape{
	public void draw() {
	}
	public void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle2 extends Shape{
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
class Triangle extends Shape{
	private int base;
	private int height;
	 
	@Override
	public void area() {
		System.out.println("삼각형의 넓이");
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

