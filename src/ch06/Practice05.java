package ch06;

/**
 * Phone, Phone의 자식 클래스 Telephone, Telephone의 
 * 자식 클래스 Smartphone을 작성하고, 테스트 프로그램도 작성하시오.
 */
public class Practice05 {
	
	public static void main(String[] args) { 
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", null, "갤러그")};
		for (Phone phone : phones) {
			if (phone instanceof Smartphone s) {// 제일 아래 자식부터 확인 해야 함. 이유 -> 부모의 메서드도 포함하므로 
				s.playGame();
			} else if (phone instanceof Telephone t) {
				t.autoAnswering();
			} else {
				phone.talk();
			} 
		}
	}
}

class Phone{ // 부모 클래스
	 protected String owner;
	 void talk() {
		 System.out.println(owner + "가 통화중 입니다.");
	 }
	 public Phone(String owner) {
		super();
		this.owner = owner;
	 }
}

class Telephone extends Phone{
	private String when;
	void autoAnswering() {
		System.out.println(owner + "가 부재중이니 " + when + " 전화주세요.");
		
	}
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
}

class Smartphone extends Telephone{
	 private String game;
	 void playGame() {
			System.out.println(owner + "가 " + game + " 게임 중 입니다.");
	 }
	 public Smartphone(String owner, String when, String game) {
		super(owner, when);
		this.game = game;
	 }
}
 
