package ch06;

/**
 * 다음 표를 참고해 MovablePoint와,MovablePoint의 부모 클래스인 Point를 작성하시오.
Point 클래스의 toString() 메서드는 좌표를 나타내는 문자열을 반환하며, MovablePoint
클래스의 toString() 메서드는 좌표와 이동 속도를 나타내는 문자열을 반환한다.
 */
public class Practice02 {
	
	public static void main(String[] args) { 
		ColoredCircle1 c = new ColoredCircle1(5, "파란");
		c.show();
	}

}

class Point{ // 부모 클래스
	//필드
	private int x, y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 접근자
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드
	public String toString() {
		System.out.printf("x좌표 : %d, y좌표 : %d", x, y);
		return null;
	}
	
}

class MovablePoint extends Point{
	 private int xSpeed, ySpeed;

	 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	 }

	 public int getxSpeed() {
		 return xSpeed;
	 }

	 public void setxSpeed(int xSpeed) {
		 this.xSpeed = xSpeed;
	 }

	 public int getySpeed() {
		 return ySpeed;
	 }

	 public void setySpeed(int ySpeed) {
		 this.ySpeed = ySpeed;
	 }
	// 메서드
	 @Override
	public String toString() {
		System.out.printf("x좌표 : %d, y좌표 : %d, x좌표속도 : %d, y좌표속도 : %d", super.getX(),super.getY(), xSpeed, ySpeed);
		return null;
	}
	 
}