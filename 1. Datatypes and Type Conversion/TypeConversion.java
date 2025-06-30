class TypeConversion{
    public static void main(String a[]){
        byte b= 127;
        int x= 12;
        int y= 257;

        //error b=x; b=y;
        x=b; // as in range
        b= (byte)y; //257%256= 1
        // if 255-> -1

        float f= 25.6f;
        int t= (int)f;  //25
    
        byte b1=10;
        byte b2=20;
        int res= b1*b2; //300

        long l= 2147483648l;
        int num= (int) l;
    }
}