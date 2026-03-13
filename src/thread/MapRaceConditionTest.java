package thread;

import java.util.*;
import java.util.concurrent.*;

public class MapRaceConditionTest {

    static final int THREAD_COUNT = 10;
    static final int LOOP_COUNT = 100000;

    public static void main(String[] args) throws Exception {

        System.out.println("HashMap 테스트");
        testMap(new HashMap<>());

        System.out.println("\nConcurrentHashMap 테스트");
        testMap(new ConcurrentHashMap<>());
    }

    static void testMap(Map<String, Integer> map) throws Exception {

        ExecutorService pool = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            pool.submit(() -> {
                for (int j = 0; j < LOOP_COUNT; j++) {

                    Integer value = map.get("count");

                    if (value == null) {
                        value = 0;
                    }

                    map.put("count", value + 1);
                }
            });
        }

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("결과: " + map.get("count"));
        System.out.println("정상 값: " + (THREAD_COUNT * LOOP_COUNT));
    }
}