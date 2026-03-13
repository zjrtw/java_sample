package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 3, "바나나", 5, "딸기", 1);// 쌍으로 가져와야 함/ 
		System.out.println(map.get("바나나"));
		System.out.println(map.size());
		
		System.out.println(map.containsKey("망고"));
		
//		Map.of 로 생성한 객체는 CRUD 불가 
		
		// CRUD 가능하도록 HashMap으로 변환
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(map);
		hashmap.put("망고", 10); // put은 기존에 key"망고" 값이 없으면 새로 추가 하고 
		System.out.println(hashmap);
		
		
		hashmap.put("망고", 4); //key 값"망고"이 존재하면 항목의 값을 수정(10 -> 4)한다. 
		System.out.println(hashmap);
		
		hashmap.remove("망고"); // key"망고"인 항목 삭제  
		System.out.println(hashmap);
		
		// 매개변수가 2개인 BiFunction 구현
		hashmap.forEach((k, v) -> System.out.println("%s : %d".formatted(k, v)));
		
		
		Set<String> keyset = hashmap.keySet();
		System.out.println(keyset); // key 값만 Set에 담기-> [사과, 바나나, 딸기]

		Collection<Integer> valueset = hashmap.values();
		valueset.forEach(System.out::println); // value 값만 출력하기-> 351
		
		Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
		System.out.println(entrySet);
		
		for (Map.Entry<String, Integer> entry : entrySet) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();

		    System.out.println(key + " : " + value);
		}
		entrySet.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
		
		
		
	}
}
