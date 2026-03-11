package ch10;

public class LamdaDemo4 {
	public static void main(String[] args) {

		// (1) 익명 클래스 방식
		// MyFunction 인터페이스를 구현하는 "익명 객체"를 생성
		MyFunction func = new MyFunction() {
			@Override
			public void myMehtod() {
				System.out.println("익명 객체 입니다.");
			}
		};

		// aMethod에 MyFunction 타입 객체 전달
		// 내부에서 f.myMethod()가 호출됨
		aMethod(func);


		// (2) 람다식 방식
		// 위의 익명 객체를 람다식으로 간단하게 표현한 것
		// MyFunction은 추상메서드가 1개라서 람다식 사용 가능
		MyFunction func1 = () -> System.out.println("익명 객체 입니다.");

		// func1 객체의 myMethod() 실행
		func1.myMehtod();


		// (3) 메서드가 람다식을 반환하는 경우
		// bMethod()는 MyFunction 타입을 반환
		// 실제로는 람다식 객체를 만들어 반환함
		MyFunction func2 = bMethod();

		// 반환받은 람다식 객체의 메서드 실행
		func2.myMehtod();
	}


	// MyFunction 타입을 매개변수로 받는 메서드
	static void aMethod(MyFunction f) {

		// 전달받은 객체의 myMethod() 실행
		f.myMehtod();
	}


	// MyFunction 타입을 반환하는 메서드
	static MyFunction bMethod() {

		// 람다식을 만들어 반환
		// 이 람다식은 MyFunction 인터페이스의 myMethod() 구현이 됨
		return () -> System.out.println("람다식 입니다.");
	}
}


// 함수형 인터페이스
// 추상 메서드가 반드시 1개만 있어야 함
@FunctionalInterface
interface MyFunction{

	// 람다식이 구현하게 될 메서드
	void myMehtod();
}