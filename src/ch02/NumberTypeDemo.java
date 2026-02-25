package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 소리가 한시간 동안 가는 거리
		int mach; // 마하 : 1시간동안 340m 이동
		int distance;
		mach = (int) 340.0; // 340.0 or 340d => double 을 int로 형변환 후 march에 넣기
		distance = mach * 60 * 60;
		System.out.printf("소리가 1시간 동안 가는 거리 %dm\n", distance);

		// 반지름이 10.0인 원의 넓이
		final double PI = 3.14;
		double radius = 10;// 10으로 넣었지만 double 타입이므로 실제 저장되는 값은 10.0(int -> double 자동 형변환)
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0인 원의 넓이는 %.2f 입니다.", area);

	}

}
