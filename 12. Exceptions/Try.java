public class Try {
    public static void main(String[] args) {
        try {
            System.out.println("Step 1");
            int x = 10 / 0; 
            System.out.println("Step 2"); // skipped
        } catch (ArithmeticException e) {
            System.out.println("Handled error at Step 3");
        }
        System.out.println("Step 4");

        // Without try cath output will be --> STep 1
    }
}
