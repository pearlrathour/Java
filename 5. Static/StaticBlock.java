class Mobile{
    static String brand;  // brand variable common to all object
    int price;

    public void show(){
        System.out.println(brand + " " + ": " + price);
    }
    
    static{
        brand= "Samsung";
        System.out.println("Static Block");
    }

    public Mobile(){
        brand="";
        price= 6000;
        System.out.println("COns");
    }
}

public class StaticBlock{
    public static void main(String  a[]){
        // but brand is static should be onli initialised only once
        // Hence static block
        //It will call cons 2 but static block only 1
        
        Mobile obj1= new Mobile();
        Mobile obj2= new Mobile();

        //Why sttaic first?
        // class loaded -> objects initialised
        // class loader in JVM
        // Class is ony loaded once from library and sbse pehle
        // eveytime u load class it calls static block

        // If obj is not created COns not called but it will not even call static block as well as class
        // How to load class?

        //Class.forName("Mobile");
    }
}