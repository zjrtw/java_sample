package ch03;

public class ReturnDemo {
	public static void main(String[] args) {
		printScore(90);
		printScore(100);
		printScore(-10);
		printScore(110);
	}

	public static void printScore(int num) {
		// 입력받은 인자 점수를 출력 하는 함수 작성
		if (0 <= num && num <= 100) {
			System.out.printf("당신의 점수는 %3d 입니다. \n", num);
		} else {
			System.out.println("유효하지 않은 숫자입니다. ");
		}
	}

}
