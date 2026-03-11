package ch05;

public class ArrayIncrementDemo {
	public static void main(String[] args) {
		int[] x = {0, 1, 2};
		System.out.println(x[0]);
		change(x);
		System.out.println(x[0]);
	}
	
	private static void change(int[] a) {
		System.out.println(a[0]);
		a[0]++;
		System.out.println(a[0]);

	}
}
