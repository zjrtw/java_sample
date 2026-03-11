package ch10;

public class LamdaDemo {
	public static void main(String[] args) {
		class Temp extends Object {
		    static int max(int a, int b) {
		        return a > b ? a : b;
		    }
		}
		new Temp().max(10, 20);

//		Object o = new Temp();
		Object o = new Object() {
			int max(int a, int b) {
				return a > b ?  a : b;
			}
		};
		
//		o.max(10, 20); => 에러발생 부모인 Object 객체에는 max가 없으므로 
		
		FunctionInterface f = new FunctionInterface() {
			
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ?  a : b;
			}
		};
		
		System.out.println(f.max(10, 20));
		
		FunctionInterface f2 = (a, b) -> a > b ?  a : b;
		System.out.println(f.max(5, 6));
		
	}
}
 
@FunctionalInterface
interface FunctionInterface {
	int max(int a, int b);
//	int min(int a, int b); // 함수형 인터페이스는 단 하나의 추상 메서드만 가진다.
}
