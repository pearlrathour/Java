import Miscellaneous.A;

class C extends A{
    public void abc(){
        System.out.println(marks);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.marks);

        B obj2= new B();
        System.out.println(obj2.marks);
    }
}
