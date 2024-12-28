class A{
    public void show(){
        System.out.println("A show");
    }
    public void display(){
        System.out.println("A Display");
    }
}

class B extends A{
    public void show(){
        System.out.println("B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj= new B();
        obj.show(); // B show
        obj.display();  // A display
    }
}
