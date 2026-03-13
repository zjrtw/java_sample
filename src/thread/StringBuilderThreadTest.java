package thread;

public class StringBuilderThreadTest {

    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws Exception {
    	Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                builder.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(builder.length());
    }
}