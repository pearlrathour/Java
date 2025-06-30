import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerj {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,2,1,6);
        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.print(n+ " ");
        //     }
        // };
        // Consumer<Integer> con = n -> System.out.print(n+ " ");

        nums.forEach(n -> System.out.print(n+ " "));
    }
}
