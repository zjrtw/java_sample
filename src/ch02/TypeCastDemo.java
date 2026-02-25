package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {
		// 연산에서의 자동 형변환
		// 정수의 나눗셈과 실수의 나눗셈은 다르다.
		int v1 = 10;
		int v2 = 3;
		int res1 = v1 / v2;
		System.out.println(res1); // 3 : 정수의 나눗셈은 몫(정수값) 만 나옴

		System.out.println(10.0 / 3.0); // 3.3333333333333335 실수의 나눗셈은 소수점까지 포함한 결과.

		// 실수를 정수로 나누면?
		System.out.println(10.0 / 3);

		double res2 = 7 / 4;
		System.out.println(" 7 / 4 : " + res2); // 1.0

		res2 = 7 / 4d;
		System.out.println(" 7 / 4d : " + res2); // 1.75

		res2 = 7 / 4.0;
		System.out.println(" 7 / 4.0 : " + res2); // 1.75

		res2 = (double) 7 / 4;
		System.out.println(" (double) 7 / 4 : " + res2); // 1.75

		res2 = (double) (7 / 4);
		System.out.println(" (double) (7 / 4) : " + res2); // 1.75

	}

}
