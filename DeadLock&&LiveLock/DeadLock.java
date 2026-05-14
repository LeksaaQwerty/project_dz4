public class DeadLock {
    
    public static void main(String[] args) {
    
   
        Object A = "А";
        Object B = "B";

        new Thread(() -> {
            synchronized (A) {
                try { 
                    System.out.println("Поток 1: Захватил А, жду B");
                    Thread.sleep(100); 
                } 
                catch (Exception e) {}

            synchronized (B) {
                System.out.println("Поток 1: Теперь у меня и А, и B!");
            } 
            }
        }).start();

        new Thread(() -> {
            synchronized (B) {
                try { 
                    System.out.println("Поток 2: Захватил B, жду А");
                    Thread.sleep(100); 
                } 
                catch (Exception e) {}
                
            synchronized (A) {
                System.out.println("Поток 2: Теперь у меня и B, и А!");
            }
            }
        }).start();
    }
}