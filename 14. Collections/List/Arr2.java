import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.println(arr.getClass().getName());

        // asList gives fixed size list backed by array
        // cannot add/remove but modify elements
        List<String > list1= Arrays.asList("M", "O", "N");
        // Cannot do ArrayList as it acnnot contain parent- List
        System.out.println(list1.getClass().getName());
        // list1.add("D");
        list1.set(2, "D");
        System.out.println(list1.get(2));

        // List.Of -> immutable list, not backed by array
        // cannot add/remove/replace
        // doesn't allow null
        List<Integer> list2= List.of(1,2,3);
        // list2.set(3, 5);  // -> error

        // Modifiable list
        ArrayList<Integer> list3= new ArrayList<>(list2);
        list3.add(1);
        list3.add(2);
        System.out.println(list3);
    }
}
