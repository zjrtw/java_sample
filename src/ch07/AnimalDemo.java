package ch07;

public class AnimalDemo {
	public static void main(String[] args) {
		makeSound(new Cat());
		makeSound(new Dog());
	}
	
	public static void makeSound(Animal animal) {
		animal.sound();	
	}
}
/**
 * @param None
 * @return void
 * 소리를 내는 동물의 경우 활용할 수 있는 인터페이스
 */
interface Animal{
	void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
class Cat implements Animal{
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
