package ch02;

import java.util.Scanner;

public class MultiDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("시험점수를 입력 해 주세요 : ");
		String grade = "";
		int score = in.nextInt();
		if (score < 0 || score > 100) {
			grade = "유효하지 않은 점수";
		} else if (90 <= score) {
			grade = "A";
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else {
			grade = "F";
		}

		System.out.printf("당신의 점수는 %d이며, 학점은 %s 입니다. ", score, grade);

	}
}
