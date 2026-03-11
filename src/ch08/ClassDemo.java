package ch08;

public class ClassDemo {
	public static void main(String[] args) {
		Keyboard k = new Keyboard.Builder().name("Logitec").model("L001").price(10000).build();
		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
	}
}
