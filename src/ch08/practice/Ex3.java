package ch08.practice;

import java.util.Calendar;

public class Ex3 {
	public static void main(String[] args) {
		String [] weekName = {"일", "월", "화", "수", "목", "금", "토"};
		String [] noonName = {"오전", "오후"};
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("%s년 %s월 %s일".formatted(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE)));
		System.out.println("%s요일 %s".formatted(weekName[c.get(Calendar.WEDNESDAY)], noonName[c.get(Calendar.AM_PM)]));
		System.out.println("%s시 %s분 %s초".formatted(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)));
		
	}
}
