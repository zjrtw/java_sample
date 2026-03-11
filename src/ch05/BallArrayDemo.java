package ch05;

public class BallArrayDemo {
	public static void main(String[] args) {
		Ball[] balls = new Ball[5];
		balls[0] = new Ball(5);
		balls[1] = new Ball(10);
		for (Ball ball : balls) {
			System.out.println(ball);
			ball.info();
		}
	}
}

class Ball {
	int radius;

	public Ball(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void info() {
		// TODO Auto-generated method stub 
		System.out.println("크기가 " + radius + "인 공입니다.");
	}

	@Override
	public String toString() {
		return "Ball [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
	// 모든 객체의 조상은 Object 임. 
	// 부모로부터 물려받은 toString 을 내가 원하는걸로 overriding 하기 
	
	
}
