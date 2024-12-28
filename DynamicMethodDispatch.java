class Computer{
    public void show(){
        System.out.println("Computer show");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("Laptop show");
    }
}

class Macbook extends Computer{
    public void show(){
        System.out.println("Macbook show");
    }
}

class D{

}


// Runtime Polymorphism
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Computer obj= new Laptop();   //ref of superclass & obj of subclass
        obj.show();

        // if Laptop has show -> Laptop show
        // else Computer show


        // Dynamic Method Dispatch
        Computer obj1= new Computer();  
        obj1.show();
        obj1= new Laptop();
        obj1.show();
        obj1= new Macbook();
        obj1.show();

        // obj1= new D();
        // will give err as D is not extending A i.e. no inheritance
    }
}
