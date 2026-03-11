package ch09;

import java.util.spi.CurrencyNameProvider;

public class GenericDemo {
	public static void main(String[] args) {
		Cup cup = new Cup();
		cup.setBeverage(new Beer());
//		Beverage beverage = cup.getBeverage(); // 컵에서 컵에 담긴걸 꺼내는데 음료가 아닐수 있으므로 에러 발생 
		Object beverage = cup.getBeverage(); // 컵에서 컵에 담긴걸 꺼내는데 음료가 아닐수 있으므로 에러 발생
//		beverage.drink(); Object 타입으므로 사용 불가
		Beverage beer = (Beer) beverage; // 강제로 다운캐스팅 해야함. 
		beer.drink();
		
		// 매번 강제 형변환을 해 줘야 함.
		cup.setBeverage(new Boricha());
		Boricha boricha = (Boricha) cup.getBeverage();  
		beer.drink();
		
		// 문제는 생성할 때 객체와 반환할 때 객체가 달라지는 경우 임. 
		cup.setBeverage(new Boricha());
		Beer beer1 = (Beer) cup.getBeverage(); //  java.lang.ClassCastException: 컴파일은 정상 작동한 뒤 런타임 단계에서 에러가 발생함.  
		beer1.drink();
	}
}
class Cup {
	private Object beverage; // 모든 객체(Object) 를 담을 수 있음(음료 뿐 아니라 장난감, 포크, 수저 등 모든 객체를 담을 수 있음)

	public Object getBeverage() {
		return beverage;
	}

	public void setBeverage(Object beverage) {
		this.beverage = beverage;
	}
	
}

class Beverage{
	void drink () {
		System.out.println("음료수를 마신다.");
	}
}

class Beer extends Beverage{}
class Boricha extends Beverage{}
