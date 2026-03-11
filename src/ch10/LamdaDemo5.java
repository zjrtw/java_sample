package ch10;

import java.util.ArrayList;

public class LamdaDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer i : list) {
            System.out.println(i);
        }

        list.forEach(i -> System.out.println(i + ", "));

        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);
    }
}