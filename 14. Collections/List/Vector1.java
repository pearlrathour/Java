import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(1);
        v.add(1);
        v.add(2);
        System.out.println(v.capacity());

        Vector<Integer> v1 = new Vector<>(1, 2);
        v1.add(1);
        v1.add(2);
        System.out.println(v1.capacity());
        
    }
}
