package ch11;

import java.util.List;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.add("B");// add 도 사용은 가능 근데 가급적 사용 안하는거 추천
		stack.push("C");
		
		System.out.println(stack.indexOf("A") + ", " + 
				stack.indexOf("B") + ", " + stack.indexOf("C"));
	}
}
