// class A{
// }

// class B{
// }

// class C extends A,B{    
// }

//Multiple Inheritance does not work in java

public class Inheritance {
    public static void main(String[] args) {
        Calc obj1= new Calc();
        System.out.println(obj1.add(2,3));

        AdvCalc obj2= new AdvCalc();
        System.out.println(obj2.add(4, 6));

        // Multilevel Iheritance
        SciCalc obj3= new SciCalc();
        System.out.println(obj3.add(2,3));
    }
}


// we need .class file for inheritance