package Miscellaneous;

class Launch {
    public void abc() {
        A obj = new A();
        System.out.println(obj.marks);
    }
}

public class A {
    public int marks;
    // public so that can be use doutside package
}
