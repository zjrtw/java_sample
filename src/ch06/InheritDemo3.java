package ch06;

public class InheritDemo3 {
	public static void main(String[] args) {
		ColorBox colorBox = new ColorBox();
	}
}

class Box{
	public Box(String color) {// 명시적으로 별도 생성자 기재
		System.out.println(color + "색 박스가 호출 되었습니다.");
	}
}

class ColorBox extends Box{ 
	ColorBox(){
		super("빨간"); // 부모클래스에 명시적 생성자[Box(String color)]가 정의되면 기본생성자[Box()]는 자동으로 생성되지 않음 => 자식 상속자에 별도로 부모 생성자를 명시 해줘야 함.  
	}
}

