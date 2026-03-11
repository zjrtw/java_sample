package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExample {

    public static void main(String[] args) throws InterruptedException {

        // 스레드 3개를 가진 스레드풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 5개의 작업 제출
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;

            executor.execute(() -> {
                System.out.println(
                    "작업 " + taskNumber + 
                    " 시작 - 실행 스레드: " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000); // 2초 대기 (작업 시뮬레이션)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(
                    "작업 " + taskNumber + " 종료"
                );
            });
        }

        // 더 이상 작업 받지 않음
        executor.shutdown();

        // 모든 작업이 끝날 때까지 대기
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("모든 작업 완료");
    }
}