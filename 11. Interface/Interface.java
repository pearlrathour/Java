interface A {
    int age= 40;
    // by def final and static

    void show();
    void config();
    // by def every method is public abstract

    public static void staticMethod(){
        System.out.println("static method in Interface");
    }

    default void defaultMethod() {
        System.out.println("default method in Interface");
    }
}
// interface will only tell the methods but will not implements eg directions bt we have to walk on our own

class B implements A{
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj;
        // obj= new A();   // cannot intantiate interface
        obj= new B();
        obj.show();
        obj.config();
        System.out.println(A.age); //as static no need of obj
        // System.out.println(obj.age);
        // System.out.println(B.age);

        A.staticMethod();
        obj.defaultMethod();
    }
}


// we can have 1 class implementing multiple interfaces but same was not possible with  class(abstract class)
// multiple inheritance possible

// class- class => extends
// class- Interface => implements
// interface- interface => extends

// https://youtu.be/NYuoR06Fyy4?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5