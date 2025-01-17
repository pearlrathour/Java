// abstract class  A {
//     public abstract void show();
//     public abstract void config();
// }


// class having only abstract methods -> Interface(not a class)
interface A {
    // int age; // by def final and static
    int age= 40;
    
    void show();
    void config();
    // by def every method is public abstract
}
// interface will only tell the methods but will not implements eg directions bt we have to walk on our won

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
        System.out.println(A.age); //as static no nee dof obj
    }
}


// we can have 1 class implementing multiple interfaces but same was not possible with  class(abstract class)
// multiple inheritance possible

// class- class => extends
// class- Interface => implements
// interface- interface => extends

// https://youtu.be/NYuoR06Fyy4?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5