package ch02;

/**
 * 
 */
public class StringDemo {
	//
	public static void main(String[] args) {

		// 문자열을 숫자로 변환 -> 해당 객체의 parse객체명 메서드 도움이 필요함
		String str = "300" + 10;
		System.out.println(str); // 출력 : 30010

		// Integer
		int i1 = Integer.parseInt(str) + 10; // static 메서드이므로 별도로 선언 안해도 사용 가능
		System.out.println(i1); // 출력 : 30020

		// Double
		double d1 = Double.parseDouble(str);
		System.out.println(d1); // 출력 : 30010.0

		// Float
		float f1 = Float.parseFloat(str);
		System.out.println(f1); // 출력 : 30010.0

		// Long
		long l1 = Long.parseLong(str);
		System.out.println(l1); // 출력 : 30010

	}

}
