package ch04;

public class StringPoolDemo {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println( str1 == str2); // 각각 아예 다른 주소에 데이터를 넣어서 false로 뜬다. 
		System.out.println( str1.equals(str2));
		
		str1 = str2;
		System.out.println( str1 == str2);
		System.out.println( str1.equals(str2));
		
		str2 = "hello2";

		System.out.println("str2 값 변경 후 " + ( str1 == str2)); 
		
		String str3 = "hello";
		String str4 = "hello"; 
		System.out.println( str3 == str4); // 기존에 먼저 생성한 동일한 값의 주소를 참조해서 true로 뜬다. 
		System.out.println( str3.equals(str4)); 
		
		 
		
	}
}
