package ch08;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		StringTokenizer st = new StringTokenizer(s, ", "); // , 와 " " 공백 각각 구분자로 인지해서 자름
		System.out.println(st.countTokens()); // 토큰이 몇개인지
		while (st.hasMoreElements()) { // 토큰이 있는지 
			System.out.println("[%s]".formatted(st.nextElement()));
		}
//		st.nextElement(); // java.util.NoSuchElementException
	}
}
