package ch11.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
/**
 * ◼ Collections 와 Random 을 이용해서 Lotto 번호를 생성하는 프로그램을 생성하세요.
 * ◼ 로또결과는 1부터 45까지 랜덤한 6개의 숫자가 정렬되어 나오도록 출력하세요.
 */
public class Ex6 {
	public static void main(String[] args) throws IOException {
		Set<Integer> set = new HashSet<>();
		Random random = new Random();
		while(set.size() < 6) {
			set.add(random.nextInt(1, 46));
	 
		} 
		List<Integer> list = new ArrayList<>(set); 
		Collections.sort(list);
		System.out.println(list);
	}
}