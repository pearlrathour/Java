public class Strings{
    public static void main(String a[]){
        // String name= "Pearl";  //String is class
        // String name= new String();
        String name= new String("Pearl");
        System.out.println("Hello "+name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Rathour"));
        System.out.println(name);
        name+= " Rathour";
        System.out.println(name);

        String s1= new String("Navin");
        String s2= new String("Navin");
        System.out.println("hbj+ " + s1.hashCode()+ " kljdkl+ " + s2.hashCode());
        // s1==s2 -> false
        
        String s3="Navin";
        String s4= "Navin";
        // 2 references bt 1 object
        // s3==s4 -> true

        String s= "10";
        int n=20;
        //s+n= "1020"
    }
}