class A{
    public void show1(){
        System.out.println("A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("B show");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        double d= 4.5;
        int i= (int) d;  //4

        // UPCASTING
        // A obj2= (A) new B();
        A obj1= new B(); // by default upcasting
        obj1.show1(); 

        A obj2= new A();
        // obj2.show2(); // A(parent) doesnt know child

        // DOWNCASTING
        B obj3= (B) obj1;
        obj3.show2();
    }
}
