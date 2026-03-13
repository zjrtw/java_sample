package thread;

import java.util.*;
import java.util.concurrent.*;

public class MapCompareTest {

    static final int THREAD_COUNT = 8;
    static final int PUT_COUNT = 100000;

    public static void main(String[] args) throws Exception {

        test(new HashMap<>(), "HashMap");
        test(new ConcurrentHashMap<>(), "ConcurrentHashMap");

    }

    static void test(Map<Integer, Integer> map, String name) throws Exception {

        Thread[] threads = new Thread[THREAD_COUNT];

        long start = System.nanoTime();

        for (int t = 0; t < THREAD_COUNT; t++) {

            final int startNum = t * PUT_COUNT;

            threads[t] = new Thread(() -> {

                for (int i = startNum; i < startNum + PUT_COUNT; i++) {
                    map.put(i, i);
                }

            });

            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long end = System.nanoTime();

        System.out.println("===== " + name + " =====");
        System.out.println("expected size : " + (THREAD_COUNT * PUT_COUNT));
        System.out.println("actual size   : " + map.size());
        System.out.println("time          : " + (end - start) / 1_000_000 + " ms");
        System.out.println();
    }
}