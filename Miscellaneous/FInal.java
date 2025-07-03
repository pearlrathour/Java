package Miscellaneous;
// final class Calc{
// to stop inheritance
class Calc{
    public final void show(){
        System.out.println("Calc show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}


class AdvCalc extends Calc{
    // public void show(){
    //     System.out.println("Adv show");
    // }
}

public class FInal {
    public static void main(String a[]){
        final int num=8;
        // num= 9;
        System.out.println(num);

        Calc obj= new Calc();
        obj.show();
        obj.add(4,5);
    }
}
