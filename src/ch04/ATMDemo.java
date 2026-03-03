package ch04;

public class ATMDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		System.out.println(atm.location);
//		Math m = new Math(); //생성자가 private 로 외부에서 호출 불가
//		String s = new String ();//생성자가 public 로 외부에서 호출 가능
	}
}
