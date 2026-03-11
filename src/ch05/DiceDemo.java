package ch05;

public class DiceDemo {
	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll(); // 결과 : 1 부터 6 사이의 값이 랜덤하게 출력
	}
}

class Dice {
	public void roll() {
		System.out.println(  Math.random() * 6  + 1);
	}
}