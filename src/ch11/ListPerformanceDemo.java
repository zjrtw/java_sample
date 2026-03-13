package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); // 사이즈는 0이지만 이미 메모리에는 10*40로 메모리 확보 상태
		LinkedList<Integer> ll = new LinkedList<>();// 사이즈는 0이고 메모리도 0

		//1. 제일 뒤에 데이터 추가시 속도 비교
		System.out.println("1. 제일 뒤에 데이터 추가시 속도 비교");
		long start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			al.add(i); // 제일 뒤에 추가
		}
		long end = System.nanoTime();
		System.out.println("ArrayList로 처리한 시간 : %d".formatted((end - start)/10000));
		

		start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			ll.add(i); // 제일 뒤에 추가
		}
		end = System.nanoTime();
		System.out.println("LinkedList로 처리한 시간 : %d".formatted((end - start)/10000));
		
		//-> 결론 이론상은 ArrayList가 속도가 더 빠를것으로 예상되지만 자바에선 DoubleLinkedList가 사용되므로  LinkedList가 더 빠름	시간복잡도 O(1) 상수
		// ArrayList 는 메모리 공간 확장 작업이 추가로 수반되므로 더 걸리기도 함. 

		//2. 제일 앞에 데이터 추가시 속도 비교
		System.out.println("2. 제일 앞에 데이터 추가시 속도 비교");
		start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			al.add(0, i); // 제일 앞에 삽입
		}
		end = System.nanoTime();
		System.out.println("ArrayList로 처리한 시간 : %d".formatted((end - start)/10000));
		

		start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			ll.add(0, i); // 제일 앞에 삽입
		}
		end = System.nanoTime();
		System.out.println("LinkedList로 처리한 시간 : %d".formatted((end - start)/10000));
		
		//  add 이용시 ArrayList는 배열 전체 이동 발생으로 시간이 엄청나게 오래 걸림
		

		//3. 제일 앞에 데이터 삭제시 속도 비교
//		System.out.println("3. 제일 앞에 데이터 삭제시 속도 비교");
//		start = System.nanoTime();
//		for (int i = 0; i < 100_000; i++) {
//			al.remove(0); // 제일 앞에 삽입
//		}
//		end = System.nanoTime();
//		System.out.println("ArrayList로 처리한 시간 : %d".formatted((end - start)/10000));
//		
//		for (int i = 0; i < 100_000; i++) {
//			ll.add(0, i); // 제일 앞에 삽입
//		}
//		start = System.nanoTime();
//		for (int i = 0; i < 100_000; i++) {
//			ll.remove(0); // 제일 앞에 삽입
//		}
//		end = System.nanoTime();
//		System.out.println("LinkedList로 처리한 시간 : %d".formatted((end - start)/10000));
		
		//  remove 역시 ArrayList는 배열 전체 이동 발생으로 시간이 엄청나게 오래 걸림
		


		//4. 제일 앞에 데이터 삭제시 속도 비교
		System.out.println("4. 제일 앞에 데이터 삭제시 속도 비교");
		start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			al.remove(al.size() - 1);
		}
		end = System.nanoTime();
		System.out.println("ArrayList로 처리한 시간 : %d".formatted((end - start)/10000));
		

		start = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			ll.remove(al.size() - 1); 
		}
		end = System.nanoTime();
		System.out.println("LinkedList로 처리한 시간 : %d".formatted((end - start)/10000));
//		
		// 제일 앞 LinkedList 삭제시 오래 걸림 
	}
}
