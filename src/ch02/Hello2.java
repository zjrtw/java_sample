package ch02;

import java.math.BigDecimal;

public class Hello2 {

	public static void main(String[] args) {
		// TODO 30억 + 50억 결과를 화면에 출력
		try {
			long n1 = 3000000000L;
			long n2 = (long) (5L * Math.pow(10, 9));
			System.out.println("결과 : " + (n1 + n2));

			// TODO 3.2 + 5.4억 결과를 화면에 출력
			double v3 = 3.2;
			double v4 = 5.4;
			System.out.println("결과 : " + (v3 + v4));

			// float vs double 정확성
			float f = 0.1f + 0.2f;
			double d = 0.1 + 0.2;
			BigDecimal vBigDecimal = new BigDecimal("0.1");

			System.out.printf("%.20f\n", f);
			System.out.printf("%.20f\n", d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
