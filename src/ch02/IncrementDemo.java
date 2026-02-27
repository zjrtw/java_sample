package ch02;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		x++; // x에 대해 먼저 처리 후 ; x = x + 1;
		++y; // y = y + 1; y에 대해 먼저 처리;

		// 독립적으로 한 줄로 사용될때는 값이 같음
		System.out.println(x);
		System.out.println(y);

		// 다른 메서드와 같이 사용 될 때
		System.out.println(x++); // x를 먼저 출력 후 x = x + 1;
		System.out.println(++y); // y = y + 1; 후 y 출력

		int i = 1;
		int res = (i != 0) ? 5 / i : 0;
		System.out.println(res);
	}
}
