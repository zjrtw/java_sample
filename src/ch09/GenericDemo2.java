package ch09;

import java.util.spi.CurrencyNameProvider;

public class GenericDemo2 {
	public static void main(String[] args) {  
		Cup1<Boricha> cupBoricha = new Cup1<>();// 뒤쪽의 Beverage 는 중복되기에 생략 가능 
		Cup1<Beer> cupBeer = new Cup1<Beer>();//실행할 때 구체적인 타입을 정의함.  
		
		// 형변환 필요없이 바로 사용 가능
		cupBoricha.setBeverage(new Boricha());
		Boricha boricha1 = cupBoricha.getBeverage();  
		boricha1.drink();
		   
		cupBeer.setBeverage(new Beer());
		Beer beer = cupBeer.getBeverage();
		beer.drink();
		
		genericMethod(100); // 컵파일러가 T를 Integer로 인지
		genericMethod("hello"); // 컵파일러가 T를 String로 인지
	}
	
	public static <T> void genericMethod (T t) {
		
	}
}

// 클래스 선언할 때 포활적으로 T라고 뭉뚱그려서 선언 하고 
class Cup1<T> {
	private T beverage; // 모든 객체(Object) 를 담을 수 있음(음료 뿐 아니라 장난감, 포크, 수저 등 모든 객체를 담을 수 있음)

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
	
	public <T> void any (T t) {
		
	}
}
 