package ch07.practice;

/**
 * Talkable 인터페이스는 talk() 메서드 하나만 포함한다. 
 * Korean 클래스와 American 클래스는 Talkable 구현 클래스이다. 
 * 다음 테스트 프로그램과 실행 결과를 참고해 
 * Talkable 인터페이스와 Korean 클래스, American 클래스를 구현하고, 테스트 프로그램도 완성하시오.
 */

interface Talkable {
	void talk();
}

class Korean implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요!");
		
	}
 
}
class American implements Talkable {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Hello!!");
		
	}
	 
}
public class Ex4 {
	static void speak(Talkable talkable){
		talkable.talk();
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}

