package ch12;

public class NationFilterDemo {
	public static void main(String[] args) {
		// 인구가 1억(100 * 백만(밀리언)) 이상의 나라 2개만 출력하되 나라 이름만 ()로 감싸서 출력하라
		Nation.nations.stream()
		.filter(n -> n.getPopulation() >= 100)
		.limit(2)
		.forEach(Util::printWithParenthesis);
	}
}
