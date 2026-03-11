package ch08;

public class GarbageCollectDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			Garbage g = new Garbage(i);
			System.gc();
		}
	}
}
class Garbage{
	
	public  int no;

	public Garbage(int no) {
		this.no = no;
		System.out.println("Garbage(%d) 생성됨".formatted(no));
	}
	
	//객체가 소멸 될 때 자동으로 호출되는 메서드 
	protected void finalize() { // 소멸자(메모리에서 제거) -> 자바에서는 사용 안함.
		System.out.println("Garbage(%d) 수거됨".formatted(no));
		
	}
}
