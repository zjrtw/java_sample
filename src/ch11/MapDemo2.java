package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();
		map.put(new Fruit("사과"), 5);
		map.put(new Fruit("바나나"), 8);
		map.put(new Fruit("귤"), 2);
		map.put(new Fruit("사과"), 5);
//		map.put(null, 2);
		
		System.out.println(map.size());
		System.out.println(map);
		
//		Map<Fruit, Integer> map1 = new Hashtable<>();
//		map1.put(new Fruit("사과"), 5);
//		map1.put(new Fruit("바나나"), 8);
//		map1.put(new Fruit("귤"), 2);
//		
//		System.out.println(map1.size());
//		System.out.println(map1);
	}
}


class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
	}
	
	// 관련 메서드 (hashcode, equals, toString)
	//Map 객체에 같은 키로 중복 저장되지 않도록 하려면 Set 객체처럼 키로 사용할 클래스에 대한
	//hashCode( )와 equals( ) 메서드를 오버라이딩해야 한다.
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override 
	public boolean equals (Object o) {
		if (o instanceof Fruit f) {
//			return this.hashCode() == f.hashCode();
			return this.name.equals(f.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Fluit[" + name + "]";
	}
	
	
}