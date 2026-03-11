package ch07;
 

public class ComparableDemo {
	public static void main(String[] args) {
		Line line1 = new Line(3);
		Line line2 = new Line(5);
		
		int res = line1.compareTo(line2);
		System.out.println(res);
		if (res == -99999999) {
			System.out.println("비교할 수 없는 객체입니다.");
		}else if (res > 0) {
			System.out.println("line1이 더 깁니다.");
		}else if (res < 0) {
			System.out.println("line2가 더 깁니다.");
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
