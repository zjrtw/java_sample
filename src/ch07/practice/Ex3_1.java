package ch07.practice;


/**
 * 선의 길이를 비교할 수 있는 Line 클래스와 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하시오. 
 * Line 클래스에는 int 타입의 length 필드가 있으며, 생성자와 필요한 메서드를 포함한다. 
 * 두 개의 라인을 생성한 후 더 길이가 긴 라인을 출력한다.
 */
public class Ex3_1 {
	public static void main(String[] args) {
		Line line1 = new Line(10);
		Line line2 = new Line(20);
		
		int res = line1.compareTo(line2);
		if (res == -99999999) {
			System.out.println("비교할 수 없는 객체입니다.");
		}else if (res > 0) {
			System.out.println("Line [length = " + line1.length + "] 이 더 깁니다.");
		}else if (res < 0) {
			System.out.println("Line [length = " + line2.length + "] 이 더 깁니다.");
		}else {
			System.out.println("길이가 같습니다.");
		}
	}
}

class Line implements Comparable {
	int length;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub  
		if (o instanceof Line line) {  
			return this.length - line.length;  
		}
		return -99999999;
	}
	
	public Line(int length) { 
		this.length = length;
	} 
}
