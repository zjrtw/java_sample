package ch11.exercise;

public class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return name + " : " + age;
	}
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person p) { 
			return this.age == p.getAge() && this.name.equals(p.getName());
		}
		return false;
	}
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
}