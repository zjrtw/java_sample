package ch12.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import ch12.Util;

/**
 * 6개의 수도("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")를 포함하는
 *  List 객체를 사용하여 다음을 수행하는 프로그램을 작성하라.
 *  1) 스트림을 생성한다.
 *  2) 스트림 원소를 정렬한다.
 *  3) 첫 번째 원소를 찾아 출력한다.
 */
public class Ex4 {
	public static void main(String[] args) {
		Stream<String> ss = Stream.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		Optional<String> os = ss.sorted().findFirst();
		if (os.isPresent()) {
			System.out.println("첫번째 원소" + os.get());
		}else {
			System.out.println("데이터가 없습니다.");
		}
		
		
		Stream.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던").sorted().limit(1).forEach(Util::print);
		Integer[] arr = List.of(1,2,3,4)
			    .stream()
			    .toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
	}
}
