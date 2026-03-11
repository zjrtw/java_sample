package ch08;

import java.util.Iterator;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		System.out.println("apple".hashCode());
		String s = new String("hi");
		System.out.println(s + " : " + s.hashCode());
		s = s + "!";
		System.out.println(s + " : " + s.hashCode());
		
		StringBuilder sb = new StringBuilder("hi"); 
		System.out.println(sb + " : " + sb.hashCode());
		sb.append("!");
		System.out.println(sb + " : " + sb.hashCode());
		sb.replace(0, 1,"s");
		System.out.println(sb + " : " + sb.hashCode());
		
		
		// String, StringBuilder 속도비교
		long before = System.nanoTime();
		String result = "";
		for (int i = 0; i < 100; i++) {
			result += i;
		}
		long after = System.nanoTime(); 
		System.out.println("String : " + (after - before));
		
		
		
		
		before = System.nanoTime();
		StringBuilder sb2 = new StringBuilder("");
		for (int i = 0; i < 100; i++) {
			sb2.append(i);
		}
		after = System.nanoTime(); 
		System.out.println("StringBuilder : " + (after - before));
	}
}

