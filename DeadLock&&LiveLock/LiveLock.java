public class LiveLock{

    /* 
    static volatile boolean run = true;
        

    new Thread(() -> {
    while (true) {
        if (run){
            System.out.println("проходи");
            run = false;
        }
        try { 
            Thread.sleep(1000); 
        }
        catch (Exception e) {}
    }
    }).start();

    new Thread(() -> {
    while (true) {
        if (!run){
            System.out.println("нет , ты проходи");
            run = true;
        }
        try { 
            Thread.sleep(1000); 
        }
        catch (Exception e) {}
    }
    }).start();
    */
}
