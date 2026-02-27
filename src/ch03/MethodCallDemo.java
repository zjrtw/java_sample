package ch03;

public class MethodCallDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("메서드 호출 전 x의 값 :" + x);
		increment(x);
		System.out.println("메서드 호출 후 x의 값 :" + x);

	}

	public static void increment(int n) {
		System.out.println("메서드 시작할 때 n의 값 : " + n);
		n++;
		System.out.println("메서드 시작할 때 n의 값 : " + n);
	}
}