public class StringBuf {
    public static void main(String a[]){
        StringBuffer s= new StringBuffer();
        System.out.println(s.capacity()); //16
        System.out.println(s.length());   //0
        //If it consumes continous location then to expand has to relaocate, Gives extra 16 spaces

        StringBuffer s1= new StringBuffer("Pearl");
        System.out.println(s1.capacity());  //21
        System.out.println(s1.length());    //5

        s1.append(" Rathour");
        System.out.println(s1.capacity()); //21
        System.out.println(s1.length());   //13

        s1.deleteCharAt(2); //Perl Rathour

        // String str= s1; //error
        String str= s1.toString();
    }
}
