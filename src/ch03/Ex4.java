package ch03;

import java.util.Scanner;

public class Ex4 {
	public static void main1(String[] args) {
		// 사용자로부터 입력을 계속 받아서 프로램을 실행한다.
		// 사용자가 -1을 입력하면 프로그램을 종료한다.
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		while (true) {
			System.out.print("숫자를 입력하세요, 종료하려면 -1을 입력하세요. :");

			if (i == -1) {
				break;
			}
			System.out.println("계속 실행합니다. ");

		}
		System.out.println("프로그램을 종료합니다.");
	}

	public static void main(String[] args) {
		// 비즈니스요구사항 : 1~10까지의 숫자 중 홀수만 출력하는 프로그램을 작성해라
		// 기술적 요구사항 : while문 사용
		int i = 1;
		while (i < 11) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;

		}
		i = 0;
		while (i < 10) {
//			System.out.print(i + ": ");
			System.out.println(++i);
			if (i % 2 == 0) {
				continue;
			}

		}
		int sum = 0;
//
//		System.out.print("==== 1 ~ 3 까지 숫자 합산 ======> ");
//
//		// 함수 (매서드)를 활용한 프로그램의 재활용, 유지보수성을 높이기 위해서 함수 사용
//		// 1부터 3까지의 합을 구하는 프로그램
//
//		for (int j = 1; j < 4; j++) {
//			sum += j;
//		}
//		System.out.println(sum);
		System.out.println(sum(1, 3));

		System.out.println(sum(4, 6));

		System.out.println(sum(7, 9));

	}

	public static int sum(int min, int max) {

		int sum = 0;
		System.out.printf("==== %d ~ %d 까지 숫자 합산 ======> ", min, max);

		for (int j = min; j <= max; j++) {
			sum += j;
		}
		return sum;

	}
}
