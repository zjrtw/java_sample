package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {
	public static void main(String[] args) { 
//		System.out.println(Car.cars);
		List<Car> list = Car.cars.subList(3,7); // 구간을 잘라서 list로 만든다.
		Car[] cars = list.toArray(new Car[0]);
		System.out.println(Arrays.toString(cars));
		
		// model 기준으로 정렬 
		Comparator<Car> modelComparator	= Comparator.comparing(Car::getModel);
		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));
		
		// 역으로 정렬
		Arrays.sort(cars, modelComparator.reversed());
		System.out.println(Arrays.toString(cars));
		
		// 마일리지 기준 순정렬
		Arrays.sort(cars, Comparator.comparingInt(Car::getMileage));
		System.out.println(Arrays.toString(cars));
		
		// 마일리지 기준 역정렬
		Arrays.sort(cars, Comparator.comparing(Car::getMileage, (a, b) -> b - a));
		System.out.println(Arrays.toString(cars));
	}
}
