package ch04;

/**
 * 가변객체 -> 불변객체로 
 */
public class Cat {
	private final String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}
