import java.util.concurrent.Semaphore;

public class Main{


    private static final Semaphore sem1 = new Semaphore(1);
    private static final Semaphore sem2 = new Semaphore(0);

    public static void main(String[] args) {
        
        new Thread(() -> {
            while (true) {
                try {
                    sem1.acquire();
                    System.out.println("1");
                    Thread.sleep(500);
                    sem2.release();
                }
                catch (InterruptedException e) {}
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    sem2.acquire(); 
                    System.out.println("2");
                    Thread.sleep(500);
                    sem1.release();
                } 
                catch (InterruptedException e) {}
            }
        }).start();
    }
}    