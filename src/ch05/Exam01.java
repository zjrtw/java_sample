package ch05;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) { 
		String str = "hello";
		System.out.println("l 호출 갯수 : " + countChar(str, 'l'));
		System.out.println("l 호출 갯수 : " + countChar(str, 'L'));
		System.out.println("l 호출 갯수 : " + countCharCompareIgnoreCase(str, 'l'));
		System.out.println("l 호출 갯수 : " + countCharCompareIgnoreCase(str, 'L')); 
		
	}
	static int countChar(String str, char c) {
		int count = 0;
		String temp = str.toUpperCase();
		for (int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == Character.toUpperCase(c)) {
				count++;
			} 
		}
		return count;
	}
	
	static int countCharCompareIgnoreCase(String str, char c) {  
		return countCharCompareIgnoreCase(str, String.valueOf(c));
	}
	
	static int countCharCompareIgnoreCase(String str, String c) {
		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if(String.valueOf(str.charAt(i)).equalsIgnoreCase(c) ) {
//				count++;
//			} 
//		}
		
		String[] arrStr = str.split(""); // 각 문자마다 String 배열에 저장

		for(String s : arrStr) {
			if(s.equalsIgnoreCase(c) ) {
				count++;
			} 
		}
		return count;
	}
	
}
