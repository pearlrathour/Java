class Mobile{
    static String brand;  // brand variable common to all object
    int price;

    public void show(){
        System.out.println(brand + " " + ": " + price);
    }

    // public static void show1(){
    //     System.out.println("Static Method");
    //     //cannot use non static var in static method and gives error
    //     //System.out.println(brand + " " + ": " + price);
    // }

    public static void show1(Mobile obj){
        System.out.println("Static Method");
        System.out.println(brand + " " + ": " + obj.price);
    }
}

public class Static{
    // if not static that means main becomes non static method 
    // i.e.if we want to call main we have to first create object of Demo, we cannot call main w/o object of Demo 
    // but main if statring point so if execution has not started how can we create obj of Demo
    // So there is a deadlock here
    public static void main(String  a[]){
        Mobile obj1= new Mobile();
        Mobile.brand= "Samsung";
        obj1.price= 15000;

        Mobile obj2= new Mobile();
        Mobile.brand= "Vivo";
        obj2.price= 18000;

        obj1.show();
        obj2.show();

       // obj1.brand= "Oppo";  // OK but static var should be accessed from class
        Mobile.brand= "Oppo";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}