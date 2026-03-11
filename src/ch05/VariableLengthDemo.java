package ch05;

public class VariableLengthDemo {
	public static void main(String[] args) {
		change(1, "a");
		change(2, "a", "b");
		change(3, "a", "b", "c");
		
	}
	
	private static void change(String s1) {
		 

	}
	private static void change(String s1, String s2) {
		
		
	}
	private static void change(String s1, String s2, String s3) {
		
		
	}
	private static void change(String... strings) {
		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();

	}
	private static void change(int i, String... strings) {
		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();

	}
}
