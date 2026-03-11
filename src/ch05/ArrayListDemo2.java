package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 동적 배열을 이용해서 정해지지 않은 학생수의 점수를 입력받아보자. 
		Scanner in = new Scanner(System.in); // 키보드 입력을 읽을 수 있는 Scanner 객체를 만든다.
	
		ArrayList<Integer> scores = new ArrayList<>();// 동적배열을 선언
		int score ;
		while(true) {
			System.out.print("학생의 점수를 입력하세요. 더이상 입력할 학생의 점수가 없으면 -1을 입력하세요. ");
			score = in.nextInt();
			if(score == -1) {
				break;
			}
			scores.add(score);
			
		}

		int total = 0;
		
//		for (int i = 0; i < scores.size(); i++) {
//			total += scores.get(i);
//		} 
		
		for (int s : scores) {
			total += s;
		} 
		
		System.out.println(String.format("%d 학생의 점수 총 합은 %d이고 평균은 %.1f 입니다."
				, scores.size(), total, total / (double) scores.size()));
		
	}
}
