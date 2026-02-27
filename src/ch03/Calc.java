package ch03;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i;

		do {
			System.out.print("구구단을 몇 단을 출력 할까요? : ");
			i = input.nextInt();

			// while문 종료 조건 추가 하기
			if (i == -1) {
				break;
			} else if (i < 2 || i > 9) {
				System.out.println("구구단을 출력 할 수 없습니다. 2단부터 9단까지만 출력 할 수 있습니다.\n");
				continue;
			}

			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %2d \n", i, j, i * j); // 숫자 오른쪽 정렬 처리

			}
		} while (true);
		System.out.println("종료합니다.");
	}
}
