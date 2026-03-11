package ch08;

public class WrapperClassDemo {
	public static void main(String[] args) {
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i + 10);

//		int i1;
//		System.out.println(i1); // 에러 The local variable i1 may not have been initialized
		
//		int i2 = null; // Type mismatch: cannot convert from null to int
//		System.out.println(i2); // 에러 
		
		Integer iI1 = Integer.valueOf(s);
		System.out.println(iI1);
		
//		Integer iI2;
//		System.out.println(iI2); // 에러 발생 => local variable iI2 may not have been initialized

	
		// 과거
		Integer iI3 = new Integer(10); 
		// 현재 - 자동으로 박싱 해줌
		Integer iI4 = 10; 
		int j = iI4.intValue(); //자동 언박싱 intValue() 를 쓸 필요없어짐
		int x = iI4;
		
	
	}
}
