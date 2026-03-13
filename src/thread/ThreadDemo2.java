package thread;

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {

        Thread t1 = new MyThread("스레드1");
        Thread t2 = new MyThread("스레드2");
        t1.start();
        t2.start();
    }
}