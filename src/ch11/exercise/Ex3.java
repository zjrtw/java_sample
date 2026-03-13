package ch11.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) throws IOException {
		
		Map<String, Integer> map = new Hashtable<>();
		map.put("김열공", 20);
		map.put("우등생", 16);
		map.put("최고봉", 56);
		map.put("나자바", 35);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름을 입력하세요 : ");
        String input = br.readLine(); // 한 줄 입력
        System.out.println(map.get(input));
	}
}
