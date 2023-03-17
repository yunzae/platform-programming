import java.util.Random;

public class MyRunnable implements Runnable {

    private static final Random random = new Random();

    @Override
    public void run() {
        System.out.println( "MyRunnable is executed...");
        int delay = 1000 + random.nextInt(4000);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
