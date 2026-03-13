package ch11.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

/**
 * HashMap에 아이디(String)와 점수(Integer)가 저장되어 있습니다. 
 * 실행 결과와 같이 평균 점수, 최고 점수, 최저 점수를 받은 아이디를 출력하도록 코드를 작성해 보세요.
 */
public class Ex7 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String maxName = ""; // 최고 점수를 받은 아이디를 저장하는 변수
		String minName = ""; // 최저 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int minScore = 100; // 최저 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		double mean = 0.0; // 평균 점수를 저장하는 변수
		// 여기에 코드를 작성하세요 (평균점수출력(.2f ), 최고점수와 최저점수 받은 아이디 출력)
		Collection<Integer> valueset = map.values();
//		 
//		maxScore = Collections.max(valueset);
//		minScore = Collections.min(valueset);
//		totalScore = valueset.stream().mapToInt(Integer::intValue).sum();
//		mean = valueset.stream().mapToInt(Integer::intValue).average().getAsDouble();

		IntSummaryStatistics stats =
				valueset.stream().mapToInt(Integer::intValue).summaryStatistics();
		
		maxScore = stats.getMax();
		minScore = stats.getMin();
		totalScore = (int) stats.getSum();
		mean = stats.getAverage();
		maxName = map.entrySet().stream()
		        .max(Map.Entry.comparingByValue())
		        .map(Map.Entry::getKey).get();
		minName = map.entrySet().stream()
				.min(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey).get();
		
		System.out.println("(평균점수출력(.2f ), 최고점수와 최저점수 받은 아이디 출력) > ");
		System.out.println("평균점수출력 : %.2f, 최고점수(%d) 아이디 : %s,  최저점수(%d) 아이디: %s)".formatted(mean, maxScore, maxName, minScore, minName));

	}
}
