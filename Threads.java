class A extends Thread{
    // public void show(){
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            // there is one Hello Hello together
            // may be 2 threads at same time and scheduler passes Hello first
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A objA= new A();
        B objB= new B();

        objB.setPriority(Thread.MAX_PRIORITY); 
        // still not all hello first because only priority is suggested for scheduler i case of all reach at same time
        // objA.start();
        // objB.start();

        objA.start();
        try{
            Thread.sleep(5);
            //sleep-> goes into waiting stage
            // now gap of 5ms so no 2 Hello together
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        objB.start();

        // Now running parallel by scheduler

        System.out.println(objA.getPriority());  //5
        System.out.println(objB.getPriority());  //5
    }
}
