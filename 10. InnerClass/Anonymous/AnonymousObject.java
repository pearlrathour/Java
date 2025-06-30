class A {
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("print");
    }
}
 
public class AnonymousObject {
    public static void main(String[] args) {
        A obj;
        System.out.println("XYZ");
        new A().show();  //object is created here
        // Anonymous Objetc as no name
        // but we cannot same object again
    }
}
