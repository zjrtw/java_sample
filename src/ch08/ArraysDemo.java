package ch08;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		String[] arr = {"j", "a", "v", "a"};
		String[] arr2 = {"j", "a", "v", "a"};
		System.out.println(Arrays.equals(arr, arr2));  //true -> 크기, 각 원소값 둥 달 동일해야 함.
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //[a, a, j, v]
		System.out.println(Arrays.equals(arr, arr2)); //false
		
		String[] arr1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arr1)); //[a, a]
		
		int idx = Arrays.binarySearch(arr, "v"); 
		System.out.println(idx); //3
		
	}
}
