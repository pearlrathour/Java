public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task= new Runnable() {
            @Override
            public void run() {
                try {
                    account.withdraw(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        // t2 will wait for t1 to finish before starting
        // drawback of synchronization is that it can lead to thread contention and reduced performance

        t1.start();
        t2.start();
    }
}
