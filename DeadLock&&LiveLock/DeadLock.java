public class DeadLock {
    
    /* 
    Object A = "А";
    Object B = "B";

    new Thread(() -> {
        synchronized (A) {
            try { 
                Thread.sleep(100); 
            } 
            catch (Exception e) {}

        synchronized (B) {} 
        }
    }).start();

    new Thread(() -> {
        synchronized (B) {
            try { 
                Thread.sleep(100); 
            } 
            catch (Exception e) {}

        synchronized (A) {}
        }
    }).start();
    */
}

