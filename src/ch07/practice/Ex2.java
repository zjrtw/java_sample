package ch07.practice;

/**
 * 다음과 같이 2개의 인터페이스가 있다. 
 * 이 2개의 인터페이스를 모두 사용하는 클래스가 자주 발생한다. 
 * 하나의 인터페이스로 통합된 Delicious 인터페이스를 작성하시오.
 */
public class Ex2 {
	public static void main(String[] args) {
		Food f = new Food();
		f.eat();
		f.sweet();
	}
}

interface Edible{
	void eat();
}

interface Sweetable{
	void sweet();
}

interface Delicious extends Edible, Sweetable{
}

class Food implements Delicious{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("먹는다");
	}

	@Override
	public void sweet() {
		// TODO Auto-generated method stub
		System.out.println("달다");
		
	}
	
}