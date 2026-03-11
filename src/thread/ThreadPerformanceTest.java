package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPerformanceTest {

    static final int TASK_COUNT = 4;
    static final long LOOP_COUNT = 500_000_000;

    public static void main(String[] args) throws Exception {

        // 단일 스레드 실행
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < TASK_COUNT; i++) {
            heavyTask();
        }

        long end1 = System.currentTimeMillis();
        System.out.println("단일 스레드 실행 시간: " + (end1 - start1) + " ms");


        // 멀티 스레드 실행
        long start2 = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(TASK_COUNT);

        for (int i = 0; i < TASK_COUNT; i++) {
            executor.execute(() -> heavyTask());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        long end2 = System.currentTimeMillis();
        System.out.println("멀티 스레드 실행 시간: " + (end2 - start2) + " ms");
    }


    static void heavyTask() {
        long sum = 0;
        for (long i = 0; i < LOOP_COUNT; i++) {
            sum += i;
        }
    }
}