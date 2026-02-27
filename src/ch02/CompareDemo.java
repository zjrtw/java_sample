package ch02;

public class CompareDemo {

	public static void main(String[] args) {
		String str1 = "hello"; // 기초타입처럼 값을 넣음
		String str2 = "hello"; // 기초타입처럼 값을 넣음

		String str3 = new String("hello");
		String str4 = new String("hello");

		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));

		String str5 = "hello";
		String str6 = new String("Hello");
		System.out.println("str5.equals(str6) : " + str5.equals(str6));
		System.out.println("str5.equals(str6) : " + str5.equalsIgnoreCase(str6));

	}
}
