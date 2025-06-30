import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Collection<Integer> nums= new HashSet<Integer>();  //also correct
        Set<Integer> nums= new HashSet<Integer>();
        nums.add(4);
        nums.add(18);
        nums.add(4);
        nums.add(6);
        nums.add(2);

        for(int n : nums) System.out.print(n + " ");
        // not in sequence and not sorted
        // does not support index value
        System.out.println();

        Iterator<Integer> values= nums.iterator();
        while(values.hasNext()){
            System.out.print(values.next() + " ");
        }
        System.out.println();

        Set<Integer> nums1= new TreeSet<Integer>();  //sorted set
        nums1.add(4);
        nums1.add(18);
        nums1.add(5);
        for(int n : nums1) System.out.print(n + " ");
    }
}
