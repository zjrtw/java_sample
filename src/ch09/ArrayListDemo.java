package ch09;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();// E : element 배열의 타입, 
		// ArrayList 는 int, doubl 같은 기초타입은 담을 수 없음, Integer, Double, String 같은 객체만 담을 수 있다. 
		list.add(10); // 
		list.add(3.14); // double x , Double o
		list.add("abc"); // String 
		
//		int i1 = list.get(0); // 객체이므로 int 로 바로 담을 수 없음 형변환이 필요함. 
//		Integer i2 = list.get(0);
		Object obj = list.get(0);
		if(obj instanceof Integer i) {
			System.out.println(i+10);
		}
		obj = list.get(1); // 3.14 를 i에 담기
//		Integer i2 = (Integer) obj; // 컴파일은 문제 없고 이후 런타임에서 에러 발생함. 
//		System.out.println(i2+10);
		
		// 해결 
		
		ArrayList<Integer> intArr = new ArrayList<>();
		
		intArr.add(10);
//		intArr.add(3.14); // 담을 때 에러 발생 컴파일 에러
		
		ArrayList<String> strArr = new ArrayList<>();
//		strArr.add(10);// 컴파일 단계에서 타입 체크 됨.
		strArr.add("agb");
		String s = strArr.get(0);// 형변환 필요없이 바로 사용 가능
		System.out.println(s);
		
		
		
		
	}
}
