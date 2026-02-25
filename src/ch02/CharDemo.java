package ch02;

public class CharDemo {

	public static void main(String[] args) {
		char c1 = 'A';
//		char c1 = "A";// 쌍따옴표 ""는 문자열이므로 에러 발생
		char c2 = 65;
		char c3 = '\u0041';
		System.out.printf("%s = %s = %s", c1, c2, c3);

		Object obj = new Object(); // 1. 4바이트 확보, 2. 힙 영역에 Object 객체 생성, 3. 주소를 1번에 확보한 4바이트 변수에 할당
		String str1 = new String("String 객체 생성"); // 원래 이렇게 사용하는게 원칙임
		String str2 = "String 객체 생성"; // 이렇게 개발자 편의상 사용가능하도록 변경됨.

		System.out.println(obj); // 출력값 : java.lang.Object@34c45dca
		System.out.println(str1); // 출력값 : String 객체 생성
		System.out.println(str2); // 출력값 : String 객체 생성

		String str3 = "hello"; // 0번째 위치에 있는 문자를 꺼내보자

		char c4 = str3.charAt(0);
		System.out.println(c4);

//		char c5 = ''; //Error
		String s1 = "";

		// 형변환
		String str4 = c4 + "";
		System.out.println(str4);

		// 숫자 => 문자열로 형변환
		String str5 = 7 + "";
		System.out.println(str5);
		System.out.println(str5.getClass().getSimpleName());

		//
		String str6 = 7 + 7 + ""; // 7 + 7 을 먼저 실행하여 14를 만들고 이후 "" 가 붙어서 문자열 14가 됨.
		System.out.println(str6); // 14

		String str7 = "" + 7 + 7; // 문자열 7 뒤에 7을 붙이면서 문자열 77이 됨.
		System.out.println(str7); // 77

		// 숫자를 문자로 : 3 => '3'
		char c6 = 3 + '0';
		// 문자를 숫자로 : '3' => 3
		int int1 = c6 - '0';

		System.out.println(c6);
		System.out.println(int1);

	}

}
