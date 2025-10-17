import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // Gives ConcurrentModificationException
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A"); 
        list.add("B");
        list.add("C");
        for (String s : list) {
            System.out.println(s);
            if(s.equals("B")){
                list.add("D"); 
                System.out.println("Added D");
            }
        }
        System.out.println("Final List: " + list);
    }
}
