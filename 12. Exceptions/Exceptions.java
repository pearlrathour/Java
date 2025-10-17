class myException extends Exceptions2{
    public myException(String s){
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]= new int[5];
        String s= null;


        try {
            j= 18/i;

            if(i==0)
                throw new ArithmeticException();
            if(i==2)
                throw new myException("Do not divide by 2");
            // System.out.println(nums[5]);
            // s.length();
        } 
        catch (ArithmeticException e) {
            // System.out.println("Cannot divide by zero: "+ e);

            // handle the exception
            System.out.println("Thats the default output");
        }        
        catch(myException e){
            System.out.println("Custom Exception: " + e);
        } 

        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Stay in list length: "+ e);
        // }
        // catch (NullPointerException e) {
        //     System.out.println("String error: "+ e);
        // }

        catch(Exceptions2 e){
            System.out.println("Something went wrong: "+ e);
        }

        System.out.println(j);
    }
}
