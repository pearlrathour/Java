interface A {
    // void show();
    void show(int i);
}

public class Lambda {
    public static void main(String[] args) {
        // already menioned variable type int 
        // when ponly 1 parameter no need of ()
        //no creating a class file

        // A obj= (i) -> System.out.println(i+ " show"); 
        A obj= i -> System.out.println(i+ " show");

            // {
            //     System.out.println("show"); 
            // };
        obj.show(5);
    }
}
