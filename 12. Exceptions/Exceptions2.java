import java.io.FileReader;
import java.io.IOException;

public class Exceptions2 {
    public static void main(String[] args) throws IOException {
        divide(3, 4);

        // level1(); Gives stack trace

        try {
            level1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Checked and Unchecked Exceptions
        Student s= null;
        // s.setId(10); // NullPointerException 

        // level3();
        // System.out.println("HJK");
        finallyBlock();

    }

    // Catching Different Types of Exceptions
    public static double divide(int a, int b) {
        try {
            return a / b;
        // } catch (Exception e){
        //     System.out.println("Something went wrong");
        //     return -1;

        // Exception has already been caught --> Exception is parent class of all exceptions
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            System.out.println(e);
            return -1;
        }  catch (Exception e){
            System.out.println("Something went wrong");
            return -1;
        }
    }

    // // Stack trace
    public static void level2() {
        int[] arr = new int[4];
        arr[5] = 10;
    }

    public static void level1() {
        level2();
    }

    // Checked Exception and throws
    public static void level3() throws IOException {
        try {
            FileReader file = new FileReader("a.txt");
            file.close();
        } catch (IOException e) {
            System.out.println("File not found");
            // We can send our own Exception Object--> Exception not handled
            throw new IOException("OOPSIE");
        }
    }

    // Finally
    public static void finallyBlock() {
        try {
            System.out.println("Try");
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }
}