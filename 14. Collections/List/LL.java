import java.util.LinkedList;

class Node{
    public int value;
    public Node next;
}

public class LL {
    public static void main(String[] args) {
        Node node1= new Node();
        node1.value= 1;
        node1.next= null;

        //Java has inbuild this
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        System.out.println(linkedList);

        // linkedList.get(2);  cannot get at index

        linkedList.addFirst(0);  // O(1)
        linkedList.addLast(30);  // O(1)
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.remove(0);
    }
}
