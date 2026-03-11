package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {
	public static void main(String[] args) {
		String msg = MessageFormat.format("{0} * {1} = {2}", 10, 5, 10*5);
		System.out.println(msg);  //10 * 5 = 50
		String msg1 = MessageFormat.format("{0} * {1} = {2}", new Object[] {3, 4, 3*4});
		System.out.println(msg1);  //3 * 4 = 12
		String msg2 = MessageFormat.format("{2}와 {1}, {2} vs {0}", new String[] {"철수0", "영희1", "바둑이2"});
		System.out.println(msg2);  //바둑이2와 영희1, 바둑이2 vs 철수0
	}
}
