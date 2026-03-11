package ch04;

public class CatDemo {
	public static void main(String[] args) {
//		Cat c1 = new Cat();
//		Cat c2 = c1;
//		Cat c3 = c2;
//		
//		
//		System.out.println("고양이의 이름 : " + c1.getName());
//		c1.setName("아옹이");
//		System.out.println("고양이의 이름 : " + c2.getName());// c1을 바꿨는데 c2까지 바껴버림. 
		
		// 결과
		/*
		 * 고양이의 이름 : 나비
		   고양이의 이름 : 아옹이
		 */
		
		Cat c1 = new Cat("나비");
		Cat c2 = c1;
		c2 = new Cat("야옹이");
		

		
		System.out.println("고양이의 이름 : " + c1.getName());

		System.out.println("고양이의 이름 : " + c2.getName());
		
	}
}
