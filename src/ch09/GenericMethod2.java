package ch09;

/**
 * a[4]의 값보다 큰 티켓 개수 구하는 문제
 */
public class GenericMethod2 {

	public static void main(String[] args) {
//		Ticket[] a = {new Ticket(11000), new Ticket(15000), new Ticket(8000), new Ticket(20000), new Ticket(10000)};
//		System.out.println(countGT(a, a[4]));
//		// 확장 가능
//		Line[] a1 = {new Line(6), new Line(3), new Line(9), new Line(5), new Line(7)};
//		System.out.println(countGT(a1, a1[0]));
		
		System.out.println("");
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb1.append("1");
		}
		
		
		
	}
	static <T extends Comparable> int countGT(T[] arr, T a) {
		int count = 0; 
		for (T ticket : arr) {
			if (ticket.compareTo(a) > 0) {count++;}
		}
		return count;
	}
}

class Ticket implements Comparable { 
	int price;

	public Ticket(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		if (this.price == 0) return 0;
//		else
		if(o instanceof Ticket t) {
			return this.price - t.price;
		}
		return price;
	}
}
class Line implements Comparable { 
	int price;

	public Line(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Line t) {
			return this.price - t.price;
		}
		return price;
	}
}