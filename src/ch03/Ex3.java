package ch03;

public class Ex3 {
	public static void main(String[] args) {
		// 중첩 반복문
		for (int c = 1; c <= 10; c++) {
			for (int r = 0; r < 10; r++) {
				System.out.printf("%2d ", r + c);
			}
			System.out.println("");

		}

		// while 문으로 변경
		System.out.println("while 문으로 변경");
		int i = 0;
		while (i < 10) {
			System.out.printf("%2d helloworld\n", ++i);
		}

		// do-while 문으로 변경
		System.out.println("do-while 문으로 변경");
		i = 0;
		do {
			System.out.printf("%2d helloworld\n", ++i);
		} while (i < 10);

	}

	//
}
