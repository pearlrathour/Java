public class MyThread extends Thread {
    
    private Cnt counter;

    public MyThread(Cnt counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    
}
