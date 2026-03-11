package ch09;

public class CheckedDemo {
	public static void main(String[] args) {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) { 
			System.err.println("CheckedException이 발생했습니다.");
		}
		System.out.println("CheckedException이 발생하지 않고 프로그램이 종료되었습니다.");
	}
}
