class Computer{
    // public access & void when we don't want anything in return
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMePen(int cost){
        return cost>=10? "Pen" : "Nothing";
    }
}

public class Method{
    public static void main(String  a[]){
        Computer c= new Computer();
        c.playMusic();
        c.getMePen(10);
        System.out.println(c.getMePen(10));
    }
}