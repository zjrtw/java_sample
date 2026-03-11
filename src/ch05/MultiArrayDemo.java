package ch05;

import java.util.Arrays;
import java.util.Iterator;

public class MultiArrayDemo {
	public static void main(String[] args) {
		int[][] interests = {{1,2,3,4,5}, {11,12,13,14,15}, {21,22,23,24,25}};

		System.out.println(interests.length);
		System.out.println(interests[0].length);
		System.out.println(Arrays.toString(interests[0]));
		System.out.println(interests[0][4]);
		for (int i = 0; i < interests.length; i++) {
			for (int j = 0; j < interests[i].length; j++) {
				System.out.print(interests[i][j] + " ");
			}
			System.out.println();
		}
	}
}
