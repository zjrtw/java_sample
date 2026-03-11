package ch10;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Comparator<String> c = (s1, s2) -> s1.length() - s2.length();

        List<String> list = Arrays.asList("aaa", "bb", "c");

        list.sort(c);

        System.out.println(list);
    }
}