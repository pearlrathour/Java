class Calculator{
    int a;
    public int add(int n1, int n2){
        System.out.println("in add");
        int r= n1 + n2;
        return r;
    }
}
public class Object{
    public static void main(String a[]){
        int num1= 1, num2=4;

        Calculator calc1; //just creating a reference -> calc1 is reference variable
        Calculator calc= new Calculator(); // object created

        // calc.add();
        int res= calc.add(num1,num2);
        System.out.println(res);
    }
}