package ch12;

import java.util.stream.IntStream;

// 느긋한 연산 
//스트림의 **중간 연산은 즉시 실행되지 않는다.**
//최종 연산이 호출될 때 실행된다.
public class LazyDemo {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		
		// 1. 스트림을 만든다.  
		// 2. 중간연산 - 1) 짝수만 걸러낸다.
		//             2) 제곱한 값을 반환한다. 
		// 2. 최종연산 - 내용을 출력한다. 
		
		// 최종연산이 없으면 실행되는건 없다. 
//		is.filter(i -> {
//			System.out.println("filter : " + i); 
//			return i%2 == 0;
//		}).map(i -> { 
//			System.out.println("map : " + i);
//			return i*i;
//		});
		
		
		is.filter(i -> {
			System.out.print(", filter : " + i); 
			return i%2 == 0;
		}).map(i -> { 
			System.out.print(" -> map : " + i);
			return i*i;
		}).forEach( i -> System.out.println(" -> forEach -> " + i));
	}
}
