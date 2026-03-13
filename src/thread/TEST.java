package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TEST {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);

		pool.submit(() -> {
		    System.out.println("작업1 실행");
		});

		pool.submit(() -> {
		    System.out.println("작업2 실행");
		});

		pool.submit(() -> {
		    System.out.println("작업3 실행");
		});
	}
}
