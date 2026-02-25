package ch02;

/**
 * 
 */
public class Hello3 {// 클래스

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // 메서드(특정 목적을 달성하기 위한 코드의 모음)
		// 메인 메서드 내부
		System.out.println("안녕");// 화면에 문자열을 직접 출력
//		 Ctrl + / 단축키 입력 주석 
		/*
		 * 여기서부터 선택하여
		 * 
		 * 여기까지 주석입니다.
		 */
		int x; // 변수 x 선언
		x = 1; // 왼쪽의 변수에 = 오른쪽의 값(리터럴)을 할당
		int y = 2; // 변수의 선언과 값 할당을 동시에 진행
		int result = x + y;
		System.out.println(result); //

		int v1 = 3;
		System.out.println(v1); // 화면에 변수의 값을 출력

		String str = "hello";
		System.out.print(str);
		System.out.print(str);
		System.out.print(str);
		System.out.println("         ");
		System.out.printf("%d %d | ", v1, v1);
		System.out.printf("%s %s", str, str);
		System.out.printf("%f %f", 3.14, 3.14);// float 의 경우 별도로 소수점 자리수 지정 안하면 소수점 6자리까지 표기됨.
		System.out.printf("%.2f %f", 3.14, 3.14);// %.{소수점자리수}f 이렇게 표기해서 소수점 자리수 지정해 줄 수 있음.

	}

}
