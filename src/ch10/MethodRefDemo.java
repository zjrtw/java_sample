package ch10;

public class MethodRefDemo {
	public static void main(String[] args) {
		Mathmatical mathmatical;
		mathmatical = d -> Math.abs(d);
		System.out.println(mathmatical.calculate(-10));
		
		mathmatical = Math::abs; // 어짜피 매개변수가 abs에 들어가는것이므로 d를 생략
		System.out.println(mathmatical.calculate(-99));
		
		
		Picakable picakable;
		picakable = (s, i) -> s.charAt(i);
		System.out.println(picakable.pick("good bye", 3));
		
		picakable = String::charAt;
		System.out.println(picakable.pick("hello", 3));
		
		
		Computable computable;
		Utils utils = new Utils();
		computable = (a, b) -> utils.add(a, b);
		System.out.println(computable.compute(2, 3));
		
		computable = utils::add;
		System.out.println(computable.compute(7, 9));
	 
		Applyable applyable; 
		applyable = (b1, b2) -> b1.isSame(b2);
		System.out.println(applyable.apply(new Box(10), new Box(20)));

		applyable = Box::isSame;
		System.out.println(applyable.apply(new Box(30), new Box(31)));
	}
}

// 함수형 인터페이스
@FunctionalInterface
interface Mathmatical{
	double calculate(double d);
}

@FunctionalInterface
interface Picakable{
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable{
	int compute(int x, int y);
}

// Utils 클래스
class Utils{
	int add(int a, int b) {
		return a + b;
	}
}

//함수형 인터페이스
@FunctionalInterface
interface Applyable {
	boolean apply(Box a, Box b);
}
class Box {
	int no;
	public Box(int no) {
		this.no = no;
	}
	boolean isSame(Box b) {
		return this.no == b.no;
	}
}