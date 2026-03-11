package ch06;

/**
 * 운송 수단과 운송 수단의 하나인 자동차를 다음과 같이 모델링하려고 한다. 
 * 각 클래스의 show() 메서드는 필드 값을 출력한다. 
 * 두 클래스를 작성하고 아래 테스트 프로그램 OverrideTest를 실행해서 오버라이딩된 메서드와 다형성 관계를 살펴보시오.
 */
public class Practice06 {
	
	public static void main(String[] args) { 
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
		
		Car c1 = (Car) v;
		c1.show();
		
		
		Car c2 = new Car("빨간", 150, 1500, 3);
		c2.show();
	}
}

class Vehicle{
	String color;// 색상
	int speed;   //속도
	
	void show() {
		// TODO Auto-generated method stub
		System.out.printf("이 이동수단의 색상은 %s 이고 속도는 %d 입니다. \n", color, speed);

	}

	public Vehicle(String color, int speed) { 
		this.color = color;
		this.speed = speed;
	}
}

class Car extends Vehicle{
	int displacement; // 자동차 배기량
	int gears;// 자동차 기어단수
	int speed;   //속도
	void show() {
		// TODO Auto-generated method stub
		System.out.printf("이 차량의 색상은 %s 이고 속도는 %d 입니다. 배기량은 %d 이고 기어단수는 %d 입니다.\n", color, speed, displacement, gears);

	}
	public Car(String color, int speed, int displacement, int gears) {
		super(color, 0);
		this.speed = speed;
		this.displacement = displacement;
		this.gears = gears;
	}
}
 