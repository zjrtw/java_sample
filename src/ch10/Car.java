package ch10;

import java.util.Arrays;
import java.util.List;

public class Car{
	private String model;
	private boolean gasoline;
	private int age;
	private int milleage;
	
	public Car(String model, boolean gasoline, int age, int milleage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.milleage = milleage;
	}

	public String getModel() {
		return model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return milleage;
	}

	@Override
	public String toString() {
		return "Car [getModel()=" + getModel() + ", isGasoline()=" + isGasoline() + ", getAge()=" + getAge()
				+ ", getMilleage()=" + getMileage() + "]";
	}
	
	public static final List<Car> cars = Arrays.asList(
			new Car("소나타", true, 18, 210_000),
			new Car("코란도", false, 15, 200_000), 
			new Car("그랜저", true, 12, 150_000), 
			new Car("산타페", false, 1, 220_000), 
			new Car("아반떼", true, 10, 70_000), 
			new Car("에쿠스", true, 6, 100_000), 
			
			new Car("그랜저", true, 5, 80_000), 
			new Car("소나타", true, 2, 35_000), 
			new Car("소렌토", false, 1, 10_000), 
			new Car("아반테", true, 1, 7_000) 
			);
}
