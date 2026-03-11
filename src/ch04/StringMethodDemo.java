package ch04;

public class StringMethodDemo {
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Java";
		String s3 = "Hello";
		
		System.out.println("s1의 문자열 길이는? " + s1.length());
		System.out.println("s2의 index 2 자리의 문자열? " + s2.charAt(2));
		System.out.println("대문자로 변환 : " + s2.toUpperCase() + ", 불변의 값인 s2 : " + s2);
		//s2의 값을 바꾸고 싶으면 새로운 값을 만들어서 할당하면 됨.
		s2 = "Python";
		System.out.println("index 1번(두번째 자리) 이후의 값만 반환 : " + s3.substring(1));
		System.out.println("index 1(두번째 자리) ~ index 3(네섯번째 자리) 사이의 값 반환  : " + s3.substring(1, 3));
		
		// isEmpty 길이가 0인지 체크 
		String n = null;
		System.out.println("\"\".isEmpty() : " + "".isEmpty());
		System.out.println("\" \".isEmpty() : " + " ".isEmpty());
		System.out.println("\"	\".isEmpty() : " + "	".isEmpty());
		// isBlank 공백제외 다른 값이 없으면 true
		System.out.println("\"\".isBlank() : " + "".isBlank());
		System.out.println("\" \".isBlank() : " + " ".isBlank());
		System.out.println("\"	\".isBlank() : " + "	".isBlank());
		
		
		
		// 정수를 , 실수를 문자열로 만드는 방법 두가지 
		String strOld = 3 + "";
		String strNew = String.valueOf(10);
		System.out.println(strOld + " : " + strOld.getClass().getName());
		System.out.println(strNew + " : " + strNew.getClass().getName());
		
		// 여러 타입의 변수들을 내가 원하는 포맷의 문자열로 만드는 방법 : String.format(), formatted
		System.out.println("PI = " + 3.14 + "입니다.");
		System.out.println(String.format("PI = %.2f입니다.", 3.14));
		System.out.println(("PI = %.2f입니다.".formatted(3.14) ));

	}
}

