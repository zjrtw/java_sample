package ch05;

import java.util.Arrays;
/**
 * Math.random 메서드(0~1 사이의 실수값을 반환함) 를 이용해서 가위,바위,보를 랜덤하게 출력하는 게임
 */
public class Exam04 {
	public static void main(String[] args) {
		String[] name = { "가위", "바위", "보" };
		System.out.println(name); // 해쉬코드 반환
		System.out.println(Arrays.toString(name)); // 내용 반환
		System.out.println(Math.random()); //0~1 사이의 실수
		int tmp = 0;
		for(int i=0; i < 10; i++) {
			tmp = (int)(Math.random() * 3);
			System.out.println(tmp + " : " + name[tmp]); 
		}
	}
}
