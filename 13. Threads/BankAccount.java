import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) throws InterruptedException {
        System.out.println("Attempting to withdraw " + amount);

        // Now no infinite waiting, try to acquire the lock for 1 second
        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
            if (balance >= amount) {
                try {
                    System.out.println("Withdrawing " + amount);
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println("Successful. Remaining balance: " + balance);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Could not acquire lock");   
        }

    }
}
