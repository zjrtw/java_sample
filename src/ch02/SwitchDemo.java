package ch02;

public class SwitchDemo {
	public static void main(String[] args) {
		// switch
		String day = "화";
		String res = switch (day) {
		case "월", "화", "수", "목", "금" -> "평일";
		case "토", "일" -> "휴일";
		default -> "유효하지 않은 요일";
		};
		System.out.println(res);

	}
}
