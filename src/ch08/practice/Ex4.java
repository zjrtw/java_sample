package ch08.practice;

import java.util.Random;

/**
 * 주사위를 굴리면 1~6 사이의 정수만 임의로 반환하므로 
 * Math클래스의 random() 메서드를 사용해 숫자를 임의로 반환하면 된다.
 * Or
 * Random 클래스의 메서드를 이용한다.
 */
public class Ex4 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(new Dice().roll());
		}
	}
}
class Dice{
	public int roll() {
		Random r = new Random();
		return r.nextInt(1, 7);
	}
}