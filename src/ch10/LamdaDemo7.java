package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 디젤 자동차만 모두 찾아보자.
▪ 10년보다 오래된 자동차만 모두 찾아보자.
▪ 10년보다 오래된 디젤 자동차만 모두 찾아보자.
▪ 디젤 자동차를 출력하되 모델과 연식만 나타나도록 출력하자.
▪ 10년보다 오래된 자동차를 출력하되 모델, 연식, 주행거리만 나타나도록 출력하자.
 */
public class LamdaDemo7 {
    public static void main(String[] args) {
    	// 디젤 자동차만 모두 찾아보자.
    	List<Car> diesels;
    	diesels = findCars(Car.cars, c -> !c.isGasoline());
//    	diesels = findCars(Car.cars, Car::isGasoline); // ! 때문에 축약 불가, 별도로 Car에 !c.isGasoline() 를 가져오는 메서드 만들어야 함. 
    	System.out.println(diesels.size() + " : " + diesels);
    	
    	// 10년보다 오래된 자동차만 모두 찾아보자.
    	List<Car> oldcars; 
    	oldcars = findCars(Car.cars, c -> c.getAge() > 10);
    	System.out.println(oldcars.size() + " : " + oldcars);
    	
    	// 10년보다 오래된 디젤 자동차만 모두 찾아보자.
    	List<Car> oldDiesels; 
    	oldDiesels = findCars(Car.cars, c -> (c.getAge() > 10 && c.isGasoline()));
    	System.out.println(oldDiesels.size() + " : " + oldDiesels);
    	
    	// 디젤 자동차를 출력하되 모델과 연식만 나타나도록 출력하자.
    	getCars(diesels, c -> System.out.println("모델 : %s, 연식 : %d".formatted(c.getModel(), c.getAge())));
    	
    	// 10년보다 오래된 자동차를 출력하되 모델, 연식, 주행거리만 나타나도록 출력하자.
    	getCars(oldcars, c -> System.out.println("모델 : %s, 연식 : %d, 주행거리 : %d".formatted(c.getModel(), c.getAge(), c.getMileage())));
    	
    }
    public static List<Car> findCars(List<Car> cars, CarPredicate carPredicate){
    	List<Car> result = new ArrayList<>();
    	for (Car car : cars) {
			if (carPredicate.test(car)) {
				result.add(car);
			}
		}
		return result; 
    }
    public static void getCars(List<Car> cars, CarConsumer carConsumer){
    	for (Car car : cars) {
    		carConsumer.apply(car);
		}
    	
    }
}
@FunctionalInterface
interface CarPredicate {
	boolean test(Car car);
}

@FunctionalInterface
interface CarConsumer {
	void apply(Car car);
}


