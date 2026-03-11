package ch07;

public interface MyInterface {
	//상수
	public static final int MIN = 0;
	public static final int MAX = 10;
	
	public abstract void sayHello();
	public abstract void sayHi();
	
	//기존 변경되지 전 sayHi까지만 구현된 객체들에 영향을 미치지 않기위해 default 선언, 필요한 객체들만 가져가서 오버라이딩
	default void talk() {} // 표준 변경 ver 1
	default void sing() {}; // 표준 변경 ver 2
}
