package ch07.practice;

/**
 * 추상 클래스도 생성자를 가질 수 있다. 
 * 다음 표와 같이 추상 클래스와 구현 클래스를 작성한 후 아래 테스트 프로그램을 실행하시오. 
 * 단, 추상 클래스와 구현 클래스의 생성자는 모든 필드를 초기화한다.
 */
public class Ex1 {
	public static void main(String[] args) {
		Concrete c = new Concrete(100, 50);
		c.show();
	}
}

abstract class Abstract{
	int i;
	abstract void show ();
	public Abstract(int i) { 
		this.i = i;
	}
}
class Concrete extends Abstract{
	int i;

	@Override
	void show() {
		System.out.println("Abstract.i : " + super.i);
		System.out.println("Concrete.i : " + this.i);
	}

	public Concrete(int i, int j) {
		super(i);
		this.i = j;
	}
}