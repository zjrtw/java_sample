package ch07;

/**
 * 익명 클래스 예시
 */
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method1();
		
		Parent parent2 = new Parent() {
			@Override
			void method1() {
				System.out.println("한번만 만들어져서 불리는 이름없는 클래스 입니다.");
			}
		};
		parent2.method1();
		
		
		ParentInterface p1 = new ParentInterface() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("부모 인터페이스를 구현한 한번만 만들어져서 불리는 이름없는 자식클래스 입니다.");
			}
			
		};
		p1.method1();
		
		
		
	} 
}

class Parent{
	void method1() {
		System.out.println("부모 클래스 입니다.");
	}
}
//class OnlyOnce extends Parent{
//	@Override
//	void method1() {
//		
//	}
//}

interface ParentInterface{
	void method1();
}
//class Once implements ParentInterface{
//	@Override
//	public void method1() {};
//}

