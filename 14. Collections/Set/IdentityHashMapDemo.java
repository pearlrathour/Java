import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // Map<String,Integer> map= new HashMap<>();
        Map<String, Integer> map= new IdentityHashMap<>();
        String key1= new String("key");
        String key2= new String("key");
        map.put(key1, 1);
        map.put(key2, 2);

        // Output will be: {key=2} because HashMap uses equals() for key comparison in case of HashMap
        
        // Identity Hashmap uses hashcode inside class Object for key comparison
        System.out.println(map);

    }
}