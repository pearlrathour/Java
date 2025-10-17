import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
        int sum=0;
        for (int n : nums) {
            if(n%2==0){
                sum+=n;
                n=n+1;
            }
        }

        System.out.println(sum);
        System.out.println(nums);

        // Stream<Integer> s1= nums.stream();  // cannot reuse stream
        // Stream<Integer> s2= s1.filter(n-> n%2==0); // [4,2]
        // Stream<Integer> s3= s2.map(n-> n*2); // [8,4]
        // int res= s3.reduce(0, (c,e)-> c+e);

        // Predicate<Integer> p= new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         if(n%2==0) return true;
        //         return false;
        //     }
        // };

        //Predicate is a func intf
        Predicate<Integer> p= n -> n%2==0;

        // Function<Integer, Integer> fun= new Function<Integer, Integer>(){
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // };

        Function<Integer, Integer> fun= n -> n*2;

        

        int res= nums.stream()
            // .filter(n-> n%2==0)
            .filter(p)
            // .map(n-> n*2)
            .map(fun)
            .reduce(0, (c,e)-> c+e);

        System.out.println(res);
    }
}
