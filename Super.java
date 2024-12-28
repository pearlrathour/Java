// https://youtu.be/u2oT-qogaFI?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5

// Super class
class A{
    public A(){
        // Its super calls cons of Object class
        // By edfault class A extends Object
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

// Sub class
class B extends A{
    public B(){
        // by default every cons has 
        // super();
        // which means call the default cons of super class

        super(5);
        // A int is called
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        // A int is called
        System.out.println("in B int");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj1= new B();  // A // B
        B obj2= new B(4);  // A // B int
        //after using super
        // A int // B int
    }
}
