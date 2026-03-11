package ch10;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		String[] arr = {"hello", "abc", "b"};
		Arrays.sort(arr);// 기본 sort  => 알파벳 사전 순
		System.out.println(Arrays.toString(arr));
		
		// 정렬 기준을 사전이 아닌 글자 수로 하고 싶으면
		//public static <T> void sort(T[] a, Comparator<? super T> c) {
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) { // sort 내부에서 비교 검증할 메서드를 Comparator에 담아서 던진다
				return 0;
			}
		}); 
		
		//람다로 변환
		Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length()); 
		System.out.println(Arrays.toString(arr));
		
		
	}
}
