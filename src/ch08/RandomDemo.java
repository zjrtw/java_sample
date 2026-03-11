package ch08;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt()); //int 정수 범위의 임의의 숫자
		}
		System.out.println("===================");
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(3)); // 0~2
		}
		System.out.println("===================");
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(1, 11)); // 1~10
		}
	}
}
