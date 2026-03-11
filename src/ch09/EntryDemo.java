package ch09;

public class EntryDemo {
	public static void main(String[] args) {
		Entry<String, Integer> e = new Entry<>("김선달", 20);
		String name = e.getKey();
		int age = e.getValue();
		System.out.println(name + " : " + age);
		
		Entry <String, String> e1 = new Entry<> ("김선달", "20");
		System.out.println(e1.getKey() + " : " + e1.getValue());
		
		Entry <Integer, Integer> e2 = new Entry<> (0, 10);
		System.out.println(e2.getKey() + " : " + e2.getValue());
		
		Entry eRow = new Entry(1, "test");// 이전 버전에 만든 코드와 호환성을 위해 Object 타입으로 담아서 쓸 수 있는 방식도 제공은 됨. 그러나 런타임 오류를 고려하여 가급적 제네릭을 사용 추천함
		System.out.println(eRow.getKey() + " : " + eRow.getValue());
		
	
	}
}
class Entry<K, V>{
	private K key;
	private V value;
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() {
		return key;
	}
	V getValue() {
		return value;
	}
}
