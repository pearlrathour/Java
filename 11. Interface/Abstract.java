abstract class Car{

    int speed;                     // instance variable
    static int wheels = 4;          // static variable
  
    // Constructor
    Car(int speed) {
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }

    public void drive(){};
    
    // Can have 0 or more abstract nethods
    // giving abstract idea of driving feature bt idk how to implement
    public abstract void drive1();

    // Concrete method
    public void playMusic(){
        System.out.println("Play Music");
    }
}

// abstract class WagonR extends Car{
class WagonR extends Car{

    WagonR(int speed) {
        super(speed);
    }

    public void drive(){
       System.out.println("Driving"); 
    }
    
    // compulsory overiding of abstract mehtod
    public void drive1(){
        System.out.println("Driving 1"); 
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Car obj= new Car();  // cannot create obj of abstract class
        Car obj= new WagonR(40);
        obj.drive();
        obj.drive1();
        obj.playMusic();
    }
}
