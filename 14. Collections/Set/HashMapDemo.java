import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(3,"Tri");

        System.out.println("HashMap: " + map);
        System.out.println(map.get(2));
        System.out.println(map.get(10));
        System.out.println(map.containsKey(3));

        // List without duplicate
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entries: " + entries);
    }
}
