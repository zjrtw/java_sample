package ch09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beer());
		list1.add(new Boricha());
		
		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());

		inherit2(new Beverage());
		inherit2(new Beer()); // 객체 자체는 상속 됨. 
		
		inherit(list1);
		//inherit(list2); // list2 는 list1과 상속 관계가 없다.
		// ArrayList<Beverage> 타입과 ArrayList<Beer>의 경우는 상속 관계가 없다.
		
	}
	
	// 상속 테스트
	// Beer가 Beverage의 자식이니 list2도 담을 수 있을까?
	static void inherit(ArrayList<Beverage> list) {
		
	}
	
	static void inherit2(Beverage b) {}
	
}
