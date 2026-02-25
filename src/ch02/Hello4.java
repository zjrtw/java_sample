package ch02;

public class Hello4 {

	public static void main(String[] args) {
		// 변수 선언과 초기화, 값을 사용하는 행위(참조) 하기 전에 초기화가 되어있어야 함 = variable
		int value = 3;
		System.out.println(value);

		// 상수 선언 = constant 이 프로그램 내에서 초기화 한번만 가능함
		final double NUMBER_PI = 3.14;
		System.out.println(NUMBER_PI);
	}

	public static void subFunction() {
		System.out.println("Hello");
	}

}
