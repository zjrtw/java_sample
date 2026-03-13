package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolLifecycle {

    public static void main(String[] args) throws InterruptedException {

        // 1. 스레드풀 생성 (스레드 3개)
        ExecutorService pool = Executors.newFixedThreadPool(3);
  
        // 2. 작업 제출
        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName()
                        + " -> 작업 " + taskId + " 실행");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            });
        }

        // 3. 작업 제출 종료
        pool.shutdown();

        // 4. 종료 대기
        if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
            pool.shutdownNow();
        }

        System.out.println("스레드풀 종료");
        
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " 작업 실행");
        });
    }
}