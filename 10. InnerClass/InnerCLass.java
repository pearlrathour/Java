class A{
    int age;
    public void show(){
        System.out.println("A show");
    }
    class B{
        public void config(){
            System.out.println("B config");
        }
    }
    // static can be only used on inner class
    static class C{
        public void config(){
            System.out.println("C config");
        }
    }
}

public class InnerCLass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        // B obj1= new B(); // not able to find B
        A.B obj1= obj.new B();
        // static doesnot need object
        A.C obj2= new A.C();
        obj1.config();
        obj2.config();
    }
}
