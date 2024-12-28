class A{
    public void show(){
        System.out.println("A show");
    }
}   

abstract class B{
    public abstract void show();
}

// class C extends B{
//     public void show() {
//         System.out.println("C show");
//     }
// }

public class AnonymousInner {
    public static void main(String[] args) {
        // Inner class without name -> anonymous class
        A obj= new A(){
            public void show(){
                System.out.println("new show");
            }
        };
        obj.show();

        // B obj1= new C();
        B obj1= new B(){
            public void show(){
                System.out.println("new show");
            }
        };
        obj1.show();
    }
}
