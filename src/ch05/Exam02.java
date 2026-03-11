package ch05;

import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = {2, 3};
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5)); 
	}
	
	static int sum (int i, int...integers) {
		System.out.println(Arrays.toString(integers));
		int total = 0;
		for (Integer integer : integers) {
			total += integer;
		}
		return total;
	} 
}
