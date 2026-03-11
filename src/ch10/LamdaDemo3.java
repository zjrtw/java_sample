package ch10;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo3 {
	public static void main(String[] args) {
		
		// Runnable : 함수형 인터페이스
		Runnable r = () -> System.out.println("Runnable 구현체 입니다.");
		r.run();
		
		Supplier<String> s = () -> "Supplier 구현체 입니다."; 
		s.get();
 
		Consumer<String> c = t -> System.out.println(t + " Consumer의 구현체 입니다.");
		c.accept("hello!!");
		
		Function<String, String> f = t -> "%s Function의 구현체 입니다.".formatted(t);
        System.out.println(f.apply("함수 "));
		
		Predicate<Integer> p = t -> t == 1 ; 
		System.out.println(p.test(1));
		
		Comparator<String> cp = (a, b) -> a.compareTo(b) ;
		System.out.println(cp.compare("1", "2"));
		Thread t1 = new Thread(() -> {
		    System.out.println(Thread.currentThread().getName());
		});
		t1.start(); 
//		t1.run();
		
		Thread t2 = new Thread(() -> {
		    System.out.println(Thread.currentThread().getName());
		});

		t2.run();
	

	}
} 