package thread;

public class StringPerformanceTest {

    public static void main(String[] args) {

        // StringBuffer
        long start1 = System.currentTimeMillis();
        
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < 10_000_000; i++) {
            sbf.append("a");
        }

        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer time : " + (end1 - start1));


        // StringBuilder
        long start2 = System.currentTimeMillis();
        
        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < 10_000_000; i++) {
            sbd.append("a");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time : " + (end2 - start2));
    }
}
