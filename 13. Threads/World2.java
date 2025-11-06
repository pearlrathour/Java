// Class has code that can be executed by a thread

public class World2 implements Runnable {
    @Override
    public void run() {
        for(; ; ) {
            System.out.println("World2");
        }
    }
}
