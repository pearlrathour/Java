import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        // Collection nums= new ArrayList();
        Collection<Integer> nums= new ArrayList<Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(8);
        // nums.add("9"); // int Int type give compile time eroor else runtime error when accessing through

        System.out.println(nums);
        // not accessbile through index
        for(int n : nums) System.out.print(n+ ", "); // error as not int n but object
        System.out.println();

        nums.forEach(n-> System.out.print(n+ ", "));
        System.out.println();

        // for(Object n : nums){
        //     int num= (Integer)n;
        //     System.out.println(num);
        // }


        List<Integer> nums1= new ArrayList<Integer>();
        nums1.add(94);
        nums1.add(12);
        nums1.add(70);
        System.out.println(nums1.get(0));
        Collections.sort(nums1);
        System.out.println(nums1);
        
        //Sort on the basis of unit digit
        Comparator<Integer> comp= new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10) return 1;
                return -1;
            }
        };
        Collections.sort(nums1, comp);
        System.out.println(nums1);
    }
}

//Comparable
//https://youtu.be/ZA2oNhtNk3w?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5
