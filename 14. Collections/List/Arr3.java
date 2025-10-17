import java.util.ArrayList;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        // -ve -> s1, s2
        // 0 -> same pref
        // +ve -> s2, s1
        return s2.length() -s1.length() ;
    }
}

public class Arr3 {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Monday");
        arr.add("Wednesday");
        arr.add("Thursday");

        arr.sort(null);
        System.out.println(arr);

        arr.sort(new StringLengthComparator());
        // arr.sort((s1,s2) -> s2.length()-s1.length());
        System.out.println(arr);

        // Comparator.comparing(function)
        
    }
}
