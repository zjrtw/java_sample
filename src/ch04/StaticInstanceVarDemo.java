package ch04;

public class StaticInstanceVarDemo {
	public static void main(String[] args) {
		Circle2 c2 = new Circle2();   // Circle2 를 본 순간 Class Loader가 static이 붙은 것들만 우선적으로 메서드 영역에 올린다.
		Circle2.printStaticInfo();
		Circle2.numOfCircle = 1;
		Circle2.printStaticInfo();
		
		c2.printInfo();
		c2.radius = 1.0; // 캡슐화 (private) 처리 하지 않아서 외부서에 내부 인스턴스 변수(필드) 호출 및 변경 가능 
		c2.printInfo();
		
		Circle2.numOfCircle++;
		Circle2 c3 = new Circle2();   
		Circle2.printStaticInfo();

		Circle2.numOfCircle++;
		Circle2 c4 = new Circle2();  
		Circle2.printStaticInfo();
		
		Circle2.numOfCircle++;
		Circle2 c5 = new Circle2(); 
		Circle2.printStaticInfo();
		
		System.out.printf("%d, %d, %d, %d", c2.numOfCircle, c3.numOfCircle, c4.numOfCircle, c5.numOfCircle); //모든 객체는 새로 생성 되어도 Circle2의 static 정보를 다 공유한다. 
		
	}
}

class Circle2{
	// 클래스는 생성자와 멤버(필드, 메서드)두가지로 구성된다. 
	
	// # 생성자
	
	
	// # 필드 = 변수
	// ## 클래스 변수
	static int numOfCircle; //Method 영역에 올라갈 때 0으로 초기화 됨.
	
	// ## 인스턴스 변수 
	double radius; // 객체가 생성될 때 생성되며 , 0.0으로 초기화 됨. 
	
	
	// # 메서드 = 함수
	// ## 클래스 메서드 -> Class Loader에 의해 메모리에 올라가짐
	// 인스턴스는 아직 생성 되기 전이므로 인스턴스 변수는 호출이 안됨. 
	static void printStaticInfo() {
		System.out.println("생성된 원의 갯수 : " + numOfCircle);
	}
	
	
	// ## 인스턴스 메서드 -> 객체가 생성 될 때 메모리에 올라감
	// 같은 영역에 있는 것 끼리만 호출 가능하므로 인스턴스 변수를 호출가능
	void printInfo() {
		System.out.println("생성된 원의 갯수 : " + radius);
	}
}
