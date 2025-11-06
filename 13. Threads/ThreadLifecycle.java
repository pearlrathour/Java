public class ThreadLifecycle implements Runnable {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycle w= new ThreadLifecycle();
        Thread t= new Thread(w);
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();  // thread waits for t to finish
        System.out.println(t.getState());
    }
}