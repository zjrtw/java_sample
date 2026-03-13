package ch12;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String s = "hello";
		Optional<String> opt = Optional.ofNullable(s); // Optional[String] 감싼 형태가 된다.
		System.out.println(opt); // Optional[hello]
		System.out.println(opt.isPresent());
		if(opt.isPresent()) System.out.println(opt.get()); // 값이 있으면 get으로 Optional 내의 값 반환
		
		String s1 = null;
		Optional<String> opt1 = Optional.ofNullable(s1); // Optional[null] 감싼 형태가 된다.
		System.out.println(opt1); // Optional.empty
//		System.out.println(opt1.get()); // java.util.NoSuchElementException: No value present
		if(opt1.isEmpty()) System.out.println("Null 값을 포함하고 있습니다."); // 값이 있으면 get으로 Optional 내의 값 반환
		
		
	}

}
