package ch05;

//정적(Static) import 문 -> 패지키 단위로 임포트하지 않고 패키지 경로와 정적 메서드를 함께 임포트
import static java.util.Arrays.sort;
import java.util.Arrays;

public class StaticImportDemo {
	public static void main(String[] args) {
		
		int[] data = {3, 5, 2, 7};
		System.out.println(Arrays.toString(data));
		
		sort(data);
		System.out.println(Arrays.toString(data));
		
		double[] datas = {1.0, 0.1, 0.7};
		sort(datas);
		System.out.println(Arrays.toString(data));
	}
}
