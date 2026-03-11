package ch10;

import java.util.ArrayList;

public class LamdaDemo6 {
    public static void main(String[] args) {
    	String s = "hello";
        UseThis u = () -> System.out.println("UseThis 람다식 구현체 입니다.");
        u.use();
        
        UseThis2 u2 = (s1) -> System.out.println(s1 + "UseThis 람다식 구현체 입니다.");
        u2.use("java, ");
         
        
        
    }
}
@FunctionalInterface
interface UseThis{ 

	void use();
}
@FunctionalInterface
interface UseThis2{ 

	void use(String s);
}

class UseThisClass implements UseThis {
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("UseThis 람다식 구현체 입니다.");
	}
};