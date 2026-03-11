package ch05;

import java.util.Arrays;

import ch04.Circle3;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [] scores = new int [5]; // 초기화를 별도로 하지 않으면 어떤 값으로 초기화 될까. 
		
		// heap에 들어갈 때 값은 0으로 초기화 되어서 들어감. 
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + ", "); // 출력값 : 0, 0, 0, 0, 0, 
		}
		
		System.out.println(scores); //타입과 주소 값 정보가 나옴 [I@ea4a92b   [: 배열 , I : integer(4byte) @ea4a92b : 첫번째 주소
		
		// 반복문 사용안하고 배열 내용쉽게 보려면 Arrays.toString(배열객체) 사용  
		System.out.println(Arrays.toString(scores));  //[0, 0, 0, 0, 0] 
		
		System.out.println("");
		scores[3] = 100;
		

		// heap에 들어갈 때 값은 0으로 초기화 되어서 들어감. 
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + ", "); // 출력값 : 0, 0, 0, 100, 0,   
		}

		System.out.println("");
		
		String[] name = new String [3];
		
		Circle3[] circle = new Circle3[3];
		
		circle[0] = new Circle3();
		
		System.out.println(Arrays.toString(circle));
		
		
		
	}

}
