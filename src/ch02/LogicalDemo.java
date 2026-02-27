package ch02;

public class LogicalDemo {
	public static void main(String[] args) {
		// 논리연산
		boolean tr1 = true;
		boolean tr2 = true;
		boolean fs1 = false;
		boolean fs2 = false;

		System.out.println(tr1 && tr2); // true
		System.out.println(tr1 && fs1); // false
		System.out.println(fs1 && fs2); // false

		System.out.println(tr1 || fs1); // true
		System.out.println(!tr1); // false
		System.out.println(tr1 ^ tr2); // false

		// 쇼트서킷 활용
		int a = 0;
		if ((5 / a) > 0 && a != 0) {
			System.out.println("무한대 값을 반환 했습니다.");
		}
	}
}
