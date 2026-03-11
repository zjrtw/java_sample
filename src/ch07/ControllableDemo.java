package ch07;

/**
 * 예를 들어, 전자제품에 포함되어야 하는 제어부의 요구 조건
▪ 모든 전자제품에는 전원을 온·오프하는 기능이 있으며, 수리 및 공장 초기화를 할 수 있다.
▪ 전자제품 객체는 turnOn( ) 메서드, turnOff( ) 메서드로만 전원을 조절할 수 있어야 한다.
▪ 수리 및 공장 초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다.
▪ 수리 기능은 자식 클래스에서 오버라이딩할 수도 있다.
 */
public class ControllableDemo {

	public static void main(String[] args) {
		Controllable[] controllables = {new TV(), new Computer(), new Notebook()};
		for (Controllable controllable : controllables) {
			controllable.turnOn();
			controllable.turnOff();
			controllable.repair();
		}
		Controllable.reset();
	}

}
//interface Controllable{
//	void turnOn();
//	void turnOff();
//
//	default void repair() {
//		System.out.println("장비를 수리 한다. ");
//	}
//	static void reset() {// 인터페이스 객체 자체로 호출 가능
//		System.out.println("초기화 한다. ");
//	}
//	private void reset1() { // 아예 외부서에 쓸 수 없음
//		
//	}
//}
//
//class TV implements RemoteControllable{ //=> Controllable과 RemoteControllable 의 추상메서드와 기본 메서드둘 다 가져온다.
//
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		System.out.println("TV를 켜다");
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		System.out.println("TV를 끄다");
//		
//	}
//
//	@Override
//	public void repair() {
//		// TODO Auto-generated method stub
////		Controllable.super.repair();
//		System.out.println("TV를 수리한다.");
//	}
//
//	@Override
//	public void remoteOn() {
//		// TODO Auto-generated method stub
//		System.out.println("TV를 리모컨으로 켜다");
//	}
//
//	@Override
//	public void remoteOff() {
//		// TODO Auto-generated method stub
//		System.out.println("TV를 리모컨으로 끄다");
//		
//	}
//	
//}
//
//interface RemoteControllable extends Controllable{
//	void remoteOn();
//	void remoteOff();
//	
//}
//
//class Computer implements Controllable { 
//
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		System.out.println("Computer를 켜다");
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		System.out.println("Computer를 끄다");
//		
//	} 
//	
//}
//
//class Notebook extends Computer implements Portable{
//
//	@Override
//	public void inMyBag() {
//		// TODO Auto-generated method stub
//		System.out.println("노트북은 내 가방안에 있다.");
//	}
//	
//}
//
//interface Portable{
//	void inMyBag();
//	
//}