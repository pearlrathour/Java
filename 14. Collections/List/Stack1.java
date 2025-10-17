import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());

        // Stack inherits Vector class
        s.add(2);  
        s.remove(0);  // remove from index 0
        System.out.println(s);
    }
}
