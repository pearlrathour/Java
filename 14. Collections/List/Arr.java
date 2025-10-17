import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("Get " + arr.get(0));
        System.out.println("Contains " + arr.contains(50));

        arr.remove(2);
        System.out.println("Size " + arr.size());
        // replaces value at that index
        arr.add(0, 50);
        arr.forEach(x -> System.out.println(x));

        System.out.println("Set");
        // won't shift but replace
        arr.set(0, 80);
        System.out.println(arr);

        System.out.println("Removing an object:");
        arr.add(80);
        //removes first occurrence of 80
        arr.remove(Integer.valueOf(80));
        System.out.println(arr);
    }
}
