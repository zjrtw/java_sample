package ch11;

public class StackDemo2 {
	public static void main(String[] args) {
		int result = factorial(5); // 5 * 4 * 3 *2 * 1 = 120
		System.out.println(result);
	}
	
	static int factorial(int n) {
		// 주석처리 하면 Exception in thread "main" java.lang.StackOverflowError
//		if (n==1) {
//			return 1;
//		}
		return n * factorial(n - 1); // 자기 자신을 호출 
	}
}
