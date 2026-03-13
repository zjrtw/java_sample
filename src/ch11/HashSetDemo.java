package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = Set.of("사과", "망고", "바나나", "수박");
		HashSet<String> hash = new HashSet<>(set);
		
		hash.add("오렌지");
		System.out.println(hash);
		

		// 중복 허용하지 않기 때문에 객수는 5개로 동일
//		hash.add("오렌지");
//		System.out.println(hash);  
		
		// 값을 포함하는지 확인
		System.out.println(hash.contains("사과"));
			
		// 해쉬값 기준으로 트리가 만들어짐. 
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println(tree.higher("오렌지")); // 제시간 값보다 레벨 높은것
		System.out.println("오렌지 > " + tree.lower("오렌지")); // 제시간 값보다 레벨 낮은것 
		System.out.println(tree.higher("수박")); // 제시간 값보다 레벨 높은것
		System.out.println("수박 > " + tree.lower("수박")); // 제시간 값보다 레벨 낮은것  
		System.out.println("사과 > " + tree.lower("사과")); // 제시간 값보다 레벨 낮은것  
		System.out.println("바나나 > " + tree.lower("바나나")); // 제시간 값보다 레벨 낮은것  
		System.out.println("망고 > " + tree.lower("망고")); // 제시간 값보다 레벨 낮은것 
		
		// 예상되는 트리
		/*
		 * 오렌지
		 *  |
		 * 수박
		 *  |
		 * 사과
		 *  |
		 * 바나나
		 *  | 
		 * 망고 
		 */
	}
}
