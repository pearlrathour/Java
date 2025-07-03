class Student{
    private int id;
    public int count= 0;
    public static int staticCount= 0;

    public Student(){
        count++;
        staticCount++;
    }

    public static void getStaticCount(){
        System.out.println(staticCount);
    }

    static{
        System.out.println("Static block");
    }
}

public class Static2 {
    public static void main(String[] args) {
        // Student s1= new Student();
        // Student s2= new Student();
 
        // System.out.println(s2.count);  //1
        // System.out.println(Student.staticCount);  //2

        Student.getStaticCount();

        System.out.println("Max: " + Utils.max(2,3));
        System.out.println("Min: " + Utils.min(2,3)); 
    }
}
