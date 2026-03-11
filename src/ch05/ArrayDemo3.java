package ch05;

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		// 정적 배열을 이용해서 정해진 학생수의 점수를 입력받아보자. 
		Scanner in = new Scanner(System.in);
		
		System.out.print("몇명의 점수를 입력 할까요? > ");
		int numberOfStudents = in.nextInt();
		int[] scores = new int[numberOfStudents];
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번째 학생의 점수 > ", i+1);
			scores[i] = in.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		System.out.println(String.format("%d 학생의 점수 총 합은 %d이고 평균은 %.1f 입니다."
				, numberOfStudents, total, total / (double) numberOfStudents));
		
	}
}
