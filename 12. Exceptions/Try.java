package Exceptions;
public class Try {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j= 18/i;
            // Not printing this
            System.out.println("Bye");
        }
        catch(Exception e){
            System.out.println("Something  went wrong");
            System.out.println("Bye");
        }
        finally{
            // for closing a resource
            // exec irrespective of exception
            System.out.println("Bye");
        }
    }
}
