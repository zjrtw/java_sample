package ch09;

import java.util.Iterator;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4};
		String[] arr2 = {"a", "b", "c"};
		Long[] arr3 = {10L,20L,30L,40L};
		
		Utils.showArryas(arr1);
		Utils.showArryas(arr2);
		Utils.showArryas(arr3);
		
		// 확장에 열려있는지 확인(Open)
		Double[] arr4 = {1.0, 2.0, 3.0};
		Utils.showArryas(arr4);
	}
	static class Utils{
//		public static void showArryas(int[] a) {
//			for (int i : a) {
//				System.out.println(i);
//			}
//		}
//		public static void showArryas(String[] a) {
//			for (String i : a) {
//				System.out.println(i);
//			}
//			
//		}
//		public static void showArryas(long[] a) {
//			for (long i : a) {
//				System.out.println(i);
//			}
//			
//		}
		
		public static <T> void showArryas(T[] a) {
			for (T i : a) {
				System.out.println(i);
			}
			System.out.println("===");
		}
	}

}
