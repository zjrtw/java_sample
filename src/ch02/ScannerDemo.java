package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main1(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자(정수)를 하나 입력하세요.");
		int input = in.nextInt();
		System.out.printf("당신이 입력한 숫자는 %d 입니다.", input);

	}

	public static void main2(String[] args) {
		// 문자열을 입력 받아서 숫자로 변환한 후 출력
		Scanner in = new Scanner(System.in);
		System.out.println("숫자(정수)를 하나 입력하세요.");
		String input = in.nextLine();
		System.out.printf("당신이 입력한 숫자는 %d 입니다.", Integer.parseInt(input));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 숫자(정수)를 입력하세요 : ");
		int x = in.nextInt();
		System.out.print("두번째 숫자(정수)를 입력하세요 : ");
		int y = in.nextInt();

	}
}
