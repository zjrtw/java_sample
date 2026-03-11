package ch06;

/**
 * 메서드는 자식 클래스가 오버라이딩할 수 있지만, 
 * 필드는 자식 클래스가 오버라이딩할 수 없다. 
 * 다음 표를 참고해 Parent와 Parent의 자식인 Child를 클래스로 작성하고
이를 아래에 있는 OvershadowTest 프로그램으로 테스트하시오.
 */
public class Practice04 {
	
	public static void main(String[] args) { 
		// Child1 을 이용해서 Parent1 타입의 p 인스턴스 객체 생성 
		// new Child1() : 메모리(Heap)에 Child1 객체를 만든다.
		// Parent1 p : Child1 객체의 위치(주소) 를 저장한다.
		//Stack                Heap
		//p  ───────────────►  Child1 객체
		Parent1 p = new Child1();
		
		Child1 p1 = new Child1();
		Parent1 p2 = (Parent1) p1;
		System.out.println(p.name);
		p.print();
//		p.print2();//Parent1에 정의 되지 않은 메서드 이므로 
		
		// 다운 캐스팅 
		Parent1 p3 = new Child1();
		Child1 c = (Child1) p3 ;
		System.out.println(c.name);
		c.print();
//		c.print2();
		
	}

}

class Parent1{ // 부모 클래스
	 String name = "영조";
	 void print() {
		 System.out.println(name);
	 }
}

class Child1 extends Parent1{
	 String name = "사도세자";
	 void print() {
		 System.out.println(name);
	 }
}
 
