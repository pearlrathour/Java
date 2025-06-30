// abstract methods only in abstract class
// abstract can have 0 or more abstract nethods
abstract class Car{
    public void drive(){};

    public abstract void drive1();
    // giving abstract idea of driving feature bt idk how to implement

    // public abstract void flying();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

// abstract class WagonR extends Car{
class WagonR extends Car{
    public void drive(){
       System.out.println("Driving"); 
    }
    // compulsory overiding of abstract mehtod
    public void drive1(){
        System.out.println("Driving 1"); 
    }
    // public abstract void flying();
}

public class Abstract {
    public static void main(String[] args) {
        // Car obj= new Car();  // cannot create obj of abstract class
        Car obj= new WagonR();
        obj.drive();
        obj.drive1();
        obj.playMusic();
    }
}
