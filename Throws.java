class A{
    public void show() throws ClassNotFoundException{
        Class.forName("XYZ");
        // try{    
        //     Class.forName("XYZ");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Not able to find the class");
        // }
    }
}
public class Throws {
    static{
        System.out.println("Class Loaded");
    }
    // public static void main(String[] args) throws ClassCastException{
        public static void main(String[] args){
        A obj= new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
