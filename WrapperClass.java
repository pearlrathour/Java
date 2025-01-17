public class WrapperClass {
    public static void main(String[] args) {
        int num=7;
        // Integer num1= new Integer(num);   //Boxing
        Integer num1= num;   //auto boxing => storing primitive value in primitive object
        int num2= num1.intValue();// auto-unboxing
        System.out.println(num1);
        System.out.println(num2);

        String str= "12";
        int num3= Integer.parseInt(str);
        System.out.println(num3);
    }
}
