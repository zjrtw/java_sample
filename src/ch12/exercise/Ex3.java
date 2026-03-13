package ch12.exercise;

import java.util.stream.Stream;

import ch12.Util;

/**
 * 4 개의 문자열("갈매기", "나비", "다람쥐", "라마")을 포함하는 리스트 객체를 
 * 스트림으로 생성한 후 문자열 크기가 2인 단어만 출력하는 프로그램을 작성하라.
 */
public class Ex3 {
	public static void main(String[] args) {
		Stream<String> ss = Stream.of("갈매기", "나비", "다람쥐", "라마");
		ss.filter(s -> s.length() == 2).forEach(Util::print);
		
	}
}
