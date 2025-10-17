abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Code, compile, run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code, compile, run, faste");
    }
}

class Developer{
    // Developer needs laptop to code
    public void dev(Computer cmp){
        cmp.code();
    }
}
public class Interface1 {
    public static void main(String[] args) {
        // Laptop lap= new Laptop();
        // Desktop desk= new Desktop();
        // Developer pearl= new Developer();
        // pearl.dev(lap);
        // but some comp gives desktop so why as dev asking for laptop
        // pearl.dev(desk); // cannot work

        Computer lap= new Laptop();
        Computer desk= new Desktop();
        Developer pearl= new Developer();
        pearl.dev(desk);
    }
}
