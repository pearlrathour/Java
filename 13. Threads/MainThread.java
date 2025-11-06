public class MainThread {
    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        // World1 world= new World1();
        // world.start();

        World2 world2= new World2();
        Thread thread= new Thread(world2);
        thread.start();

        for(; ; ) {
            System.out.println("Hello");
        }

        // Hello + World1
    }
}
