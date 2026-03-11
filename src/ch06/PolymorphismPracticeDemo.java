package ch06;

public class PolymorphismPracticeDemo {
	public static void main(String[] args) {
		// 각각의 호환되는 두개의 리모컨이 있다고 했을 
		Tv tv_remotecontrol = new Tv(); //호환되는 구식 일반 TV리모컨
		SmartTv smart_remotecontrol = new SmartTv(); //호환되는 신식 Smart TV리모컨
		
		// Tv 클래스 타입의 참조변수 remoteControl를 선언한다.
		// SmartTv의 인스턴스를 생성하고, 이 인스턴스의 주소값을 참조변수 remoteControl에 대입한다.
		Tv tv_remoteControl_smartTv = new SmartTv(); // 구식 일반 TV리모컨으로 신식 Smart TV 를 켜고 끄고 할 수 있다. 
		tv_remoteControl_smartTv.powerOn_Off();
		//		tv_remoteControl_smartTv.AI_Assistance(); // 그러나 신식 기능은 사용 못함.
		
		// SmartTv smart_remotecontrol_basicTv = new Tv(); // 신식 Smart TV리모컨으로 구식 일반 TV를 동작 시킬 순 없다.
	}
	
}
class Tv {
    void powerOn_Off() {} // 전원 켜기/끄기
    void volumeOn_Off() {} // 볼륨 켜기/끄기
    void channelOn_Off() {} // 채널 돌리기
}

class SmartTv extends Tv {
    void AI_Assistance() {} // 인공지능 기능
    void shopping() {} // 쇼핑하기
}