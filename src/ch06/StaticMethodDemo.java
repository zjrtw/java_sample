package ch06;

public class StaticMethodDemo {
	public static void main(String[] args) {
//		Parent p = new Parent();
		Parent.method();
		Child.method();
		Parent c = new Child();
		c.method();
	}
}

class Parent {
    static void method() {// 오버라이딩 아님. Child에 귀속되는 정적메서드
    	System.out.println("부모클래스");
    }
}

class Child extends Parent {
    static void method() {// 오버라이딩 아님. Child에 귀속되는 정적메서드
    	System.out.println("자식클래스");
    }  
}