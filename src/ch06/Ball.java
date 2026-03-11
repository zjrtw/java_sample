package ch06;

public class Ball extends Circle{ // 자식
	
	// 원의 넓이 구하는걸 그대로 사용하면 문제가 됨. 
	// 구의 넒이 구하는 로직으로 수정
	@Override
	public void findArea(){
		System.out.println("넓이는 " + 4 * 3.14 * radius * radius * radius + "입니다. ");
	}
}
class Circle { // 부모
	int radius;
	
	public void findRadius(){
		System.out.println("반지름은 " + radius + "입니다. ");
	}
	public void findArea(){
		System.out.println("넓이는 " + 3.14 * radius * radius + "입니다. ");
	}
	
}
