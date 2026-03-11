package ch07.practice;

/**
 * 삼각형의 넓이를 기준으로 어떤 삼각형이 더 큰지를 비교할 수 있는 Triangle 클래스와 
 * 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하시오. 
 * Triangle 클래스에는 int 타입의 width 필드와 height 가 있으며, 생성자와 필요한 메서드를 포함한다. 
 * 두 개의 삼각형을 생성한 후 더 넓이가 큰 삼각형을 출력한다.
 * 
 * 주의사항 : 넓이 구하는 공식 (height * width) * (1/2) 로 구하는 경우 ,
 * 넓이가 0 이 나오지 않게 주의하기
 */

class Triangle implements Comparable {
	int width;
	int height;

	public Triangle(int width, int height) {
		super();
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		}
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub 
		if (o instanceof Triangle triangle 
				&& triangle.width > 0  &&  triangle.height > 0) { 
			return findArea(this.width, this.height) - findArea(triangle.width, triangle.height);
		}
		return -99999999;
	}
	
	int findArea(int width, int height) { 
		return (width * height) / 2;
	}
	
	
}
public class Ex3_2 {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(10, 10);
		Triangle triangle2 = new Triangle(5, 10);
		
		int res = triangle1.compareTo(triangle2); 
		if (res == -99999999) {
			System.out.println("비교할 수 없는 객체입니다.");
		}else if (res > 0) {
			System.out.println(String.format("삼각형 [width = %d, height = %d, 넓이 = %d] 이 더 큽니다.", triangle1.width, triangle1.height, (triangle1.width * triangle1.height) / 2));
		}else if (res < 0) {
			System.out.println(String.format("삼각형 [width = %d, height = %d, 넓이 = %d] 이 더 큽니다.", triangle2.width, triangle2.height, (triangle2.width * triangle2.height) / 2));
		}else {
			System.out.println("면적이 같습니다.");
		}
	}
}

