package ch02;

public class OverlateDemo {
	public static void main1(String[] args) {

//		System.out.printf("%d와 %d를 곱한 결과는 %d 입니다.", x, y, x - y);
		int i = 1_000_000;
		int j = 2_000_000;
		long result = i * (long) j;
		System.out.println(result);

		// 무한대(Infinity) 예제
		double res = 5 / 0.0;
		System.out.println(res + 1);

		System.out.println(Double.isInfinite(res));
		if (Double.isInfinite(res)) {
			System.out.println("무한대 값을 반환 했습니다.");
		} else {
			System.out.println(res + 100);
		}

		// NaN (Not a Number)
		double res2 = 5 % 0.0;
		System.out.println(res2);

	}

	public static void main(String[] args) {

		int remainder = 25 % 2;
		System.out.printf("25/2의 나머지는 %d 이다", remainder);

	}
}
