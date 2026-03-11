package ch07.practice;

/**
 * 다음 표와 같은 멤버를 가진 Controller 추상 클래스가 있다. 
 * TV와 Radio 클래스는 Controller의 구현 클래스이다. 
 * Controller, TV, Radio 클래스를 작성하시오. 
 * 그리고 ControllerTest 프로그램으로 테스트하시오.
 */

public class Ex5 {
	public static void main(String[] args) {
		Controller[] c = {
			new TV(false),
			new Radio(true)
		};
		Controller r = new Radio(true); 
		
		for (Controller controller : c){ 
			controller.show();
		}
	}
}


abstract class Controller {
	boolean power;
	abstract String getName();
	public Controller(boolean power) {
		this.power = power;
	}
	public void show() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println(this.getName() + "가 켜졌습니다. On");
		}else {
			System.out.println(this.getName() + "가 꺼졌습니다. Off");
		}
	}
}

class TV extends Controller {

	
	public TV(boolean power) {
		super( power); 
	}

	@Override
	public String getName() {
		return "TV";
	}
 
}
class Radio extends Controller {

	public Radio(boolean power) {
		super(power); 
	}

	@Override
	public String getName() {
		return "Radio";
	}
	 
}