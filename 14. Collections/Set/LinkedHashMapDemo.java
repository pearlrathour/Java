import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.3f, true);
        map.put("Orange", 1);
        map.put("Apple", 2);
        map.put("Banana", 3);
        System.out.println("LinkedHashMap: " + map);

        map.get("Apple");
        // Access order = true
        System.out.println("After accessing 'Apple': " + map);

        Integer res= map.getOrDefault("Gauva", 0);
        System.out.println(res);

        map.putIfAbsent("Gauva", 4);
        System.out.println("After putIfAbsent 'Gauva': " + map);
    }
}
