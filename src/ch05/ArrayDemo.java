package ch05;

import java.util.concurrent.ForkJoinPool;

public class ArrayDemo {
	public static void main(String[] args) {
		//요구사항 : 다섯명의 학생의 점수를 각각 저장하고 합계와 평균을 구해주세요.  
		int[] scores = {100, 90, 80, 95, 88};
		
		System.out.println("갯수  : " + scores.length);
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total = total + scores[i]; 
		} 
		
		String res = String.format("합계 : %d, 평균 : %.2f ", total, total / (double) scores.length);
		System.out.println(res);
		
		// 정해진 크기의 여러개의 데이터를 담으려면??? => 배열
		
	}
	
}
