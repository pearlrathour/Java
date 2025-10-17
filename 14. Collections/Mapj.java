import java.util.HashMap;
import java.util.Map;

public class Mapj {
    public static void main(String[] args) {
        // Map is Intf
        // key-> set, val->list
        Map<String, Integer> students= new HashMap<>();
        students.put("John", 20);
        students.put("Mary", 21);
        students.put("Silviya", 18);
        students.put("Mary", 24);

        System.out.println(students);  // unordered
        System.out.println(students.get("John"));
        System.out.println(students.keySet());
        for(String name : students.keySet()){
            System.out.println(name + ": " + students.get(name));
        }
    }
}
