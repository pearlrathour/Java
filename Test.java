import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add(2);
        list.add(2.3);
        Double a= (Double) list.get(2);
        System.out.println(a);


        // Generic
        // <T> -> jo bhi <__> dala wo bn jaega -> placholder (at compile time)

        // <?> -> ? extends Number eg Integer, Double, Float
        // <Optional>

        
    }
}
