package ch04;

public class StringCompareDemo {
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = "A";
		
		System.out.println(str1.compareTo(str2));// 유니코드 숫자 값으로 비교 => str1유니코드 - str2유니코드 = -1 
		System.out.println(str2.compareTo(str1));// 유니코드 숫자 값으로 비교 => str2유니코드 - str1유니코드 = 1
		System.out.println(str3.compareToIgnoreCase(str1));// 유니코드 숫자 값으로 비교 => str3 str1 둘 다 대문자 변환 후 비교, str3대분자 유니코드 - str1대문자유니코드 = 0
//		if () {
//			
//		}
		
	}
}
