public class Methods extends Thread {

    public Methods(String name) {
        super(name);
    }

    // Priority example

    // @Override
    // public void run() {
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority()
    //                 + " count: " + i);
    //         try {
    //             Thread.sleep(500);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }

    // Interrupt example
    // @Override
    // public void run() {
    //     try{
    //         Thread.sleep(2000);
    //         System.out.println("Thread is running");
    //     } catch (InterruptedException e) {
    //         System.out.println("Thread Interrupted" + e);
    //     }
    // }

    //Yield example
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();   // stop it's exec and let other threads run
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Methods t1 = new Methods("Low Priority");   // User Threads
        Methods t2 = new Methods("Med Priority");
        Methods t3 = new Methods("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5 
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t1.setDaemon(true); // set as daemon thread
        System.out.println("DONE");
        // t2.start();
        // t3.start();

        // t1.interrupt();

        // Daemon Thread
        // Run in bg eg garbage collector
        // JVM does not wait for daemon threads to complete
    }
}
