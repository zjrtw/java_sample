package ch11.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex4 {
	public static void main(String[] args) throws IOException {

		// 정적 배열을 이용해서 정해진 학생수의 점수를 입력받아보자. 
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			
			try {
				System.out.print("점수를 입력하세요 : ");
				int score = in.nextInt();
				if (score < 0) {
					break;
				}else if(score > 100){ 
					System.out.print("잘못입력하셨습니다.");
				}else { 
					list.add(score);
				}
			} catch (Exception e) {
				//nextInt() -> 문자입력시 Exception 발생함. 이를 해결 하기 위해 try catch 문으로 감싸주고 in.nextLine(); 작업을 해 줘야 한다. 
				// 아니면 그냥 in.nextLine();로 입력받고 숫자로 형변환 및 예외처리 구문을 넣어줘야 한다. 
				// TODO Auto-generated catch block
				System.out.print("잘못입력하셨습니다.");
				in.nextLine();
			}
			
		}
		
		System.out.println("전체 학생은 %d 명이다".formatted(list.size()));
		System.out.print("학생들의 성적 : ");
		list.stream().forEach(v -> System.out.print(v + " "));
		System.out.println();
	
//		
//		System.out.println(String.format("%d 학생의 점수 총 합은 %d이고 평균은 %.1f 입니다."
//				, numberOfStudents, total, total / (double) numberOfStudents));
		int max = Collections.max(list);
		IntStream.range(0, list.size()).mapToObj(i -> {
			String grade;
			if (list.get(i) >= (max - 10)) {
				grade = "A";
			}else if(list.get(i) >= (max - 20)) {
				grade = "B";
			}else {
				grade = "C";
			}
			return "%d번 학생의 성적은 %d점이며 등급은 %s이다".formatted(i, list.get(i), grade);
		}) 
        .forEach(System.out::println);

	} 
}

class Student{
	
}
