import java.util.Random;

public class MyThread extends Thread {

    private static final Random random = new Random();


    @Override
    public void run() {
        System.out.println( "MyThread starts...");
        int delay = 1000 + random.nextInt(4000);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( "MyThread ends...");
    }

}