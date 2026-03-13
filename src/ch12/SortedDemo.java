package ch12;

import java.util.Comparator;

public class SortedDemo {
	public static void main(String[] args) {
		System.out.println("국가 이름 순서:");
		Nation.nations.stream()
			// Comparator 람다식, Comparator.comparator.comparing(비교기준)
			.sorted(Comparator.comparing(Nation::getName)) 
			.forEach(Util::printWithParenthesis);
		
		System.out.println("\n\n국가 이름 역순:");
		Nation.nations.stream()
			.sorted(Comparator.comparing(Nation::getName).reversed()) 
			.forEach(Util::printWithParenthesis);
		

		System.out.println("\n\n국가 GDP 순서:");
		Nation.nations.stream()
			.sorted(Comparator.comparing(Nation::getGdpRank)) 
			.forEach(Util::printWithParenthesis);

		System.out.println("\n\n국가 인구순서(인구수 많은 나라부터) :");
		Nation.nations.stream()
			.sorted(Comparator.comparing(Nation::getPopulation).reversed()) 
			.forEach(Util::printWithParenthesis);
		
		// 메서드 참조를 사용 안하면 에러나 가는 이유
		// n의 타입을 컴파일러가 추론하지 못해서 Object로 판단한다.
		// 그래서 Object 타입에는 getGdpRank() 메서드가 없기 때문에 에러가 발생한다.
		// (Nation n) 이렇게 오브젝트 타입을 별도로 명시 해 줘야 한다. 
		System.out.println("\n\n국가 GDP 순서:");
		Nation.nations.stream()
			.sorted(Comparator.comparing((Nation n) -> n.getGdpRank()).reversed()) 
			.forEach(Util::printWithParenthesis);
	}
}
