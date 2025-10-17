import java.util.SortedMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new java.util.TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("SortedMap contents: " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Head Map (keys < 2): " + map.headMap(2));
        System.out.println("Tail Map (keys >= 2): " + map.tailMap(2));;
    }
}
