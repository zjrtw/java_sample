package ch07;

public class MyInterfaceDemo {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.sayHello();
		m.sayHi();
	}
}


class MyClass implements MyInterface{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("talk");
		
	}
}