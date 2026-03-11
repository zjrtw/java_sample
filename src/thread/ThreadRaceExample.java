package thread;

class Counter {
    int count = 0;
}

class MyTask implements Runnable {

    Counter counter;

    public MyTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.count++;   // 여러 스레드가 동시에 증가
        }
    }
}

public class ThreadRaceExample {

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        Runnable task = new MyTask(counter);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}