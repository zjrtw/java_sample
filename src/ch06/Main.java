package ch06;

class MyThread extends Thread {
    public void run() {
        System.out.println("스레드 실행 중!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // run() 실행
    }
}