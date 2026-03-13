package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		int[] ia = {2, 3, 5, 7, 11, 13};
		IntStream is = Arrays.stream(ia);
//		System.out.println(is.average());
		System.out.println(is.sum()); 
//		System.out.println(is.summaryStatistics()); // IntSummaryStatistics{count=6, sum=41, min=2, average=6.833333, max=13}
		Stream<Integer> is1 = Stream.of(2, 3, 5, 7, 11, 1);
		IntStream is2 = IntStream.of(2, 3, 5, 7, 11, 1);
		System.out.println(is2.summaryStatistics());
		
		System.out.println(is1);
		
		String[] strings = {"The", "pen", "is", "mighter", "than", "the", "sword"};
		Stream<String> ss = Arrays.stream(strings); 
		
		
		IntStream is3 = IntStream.iterate(100, i -> i*2 );
		IntStream is4 = new Random().ints(0, 100);
		
		Stream<Double> ds = Stream.generate(() -> Math.random());
		Stream<Double> ds1 = Stream.generate(Math::random);// 메서드 참조로 표현
		
		IntStream is5 = IntStream.rangeClosed(1, 10);
	}
}
