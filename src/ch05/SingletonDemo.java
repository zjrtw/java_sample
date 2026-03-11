package ch05;

public class SingletonDemo {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton() ;
//		Singleton obj2 = new Singleton(); // obj1,obj2를 각각 생성하면 오류 발생

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); // obj1,obj2를 이렇게 생성하면 문제 없음

		//그 후에
		if(obj1 == obj2){
		System.out.println("같은 singleton 객체입니다.");
		}
		else {
			System.out.println("다른 singleton 객체입니다."); 
		}
	}
}
