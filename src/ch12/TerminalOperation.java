package ch12;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {
	public static void main(String[] args) { 
		System.out.println("모든 국가의 인구가 1억이 넘는가? " + Nation.nations.stream().allMatch(n->n.getPopulation() > 100.0));
		
		
		//Nation n = Nation.nations.stream().findFirst(); //-> Optional로 감싸야 한다. 
		Optional<Nation> n = Nation.nations.stream().findFirst();
		n.ifPresent(Util::print);
		
		// 변수를 잘못 참조해서 쓸수도 있어서 쓸 수 있다면 메서드 참조를 사용
		Optional<Nation> n1 = Nation.nations.stream().filter(Nation::isIsland).findAny();
		n1.ifPresent(Util::print);
		
		Stream<Nation> ns = Nation.nations.stream();
		
		Optional<Nation> on = ns.max(Comparator.comparing(Nation::getPopulation));
		System.out.println("\n 인구가 가장 많은 나라 : " + on.get());
		
		OptionalInt oi = IntStream.of(1,2,3,4,5).max();
		System.out.println("max : " + oi.getAsInt());
		

		long count = IntStream.of(1,2,3,4,5).count();
		System.out.println("count : " + count);

		int sum = IntStream.of(1,2,3,4,5).sum();
		System.out.println("sum : " + sum);
	}
}
