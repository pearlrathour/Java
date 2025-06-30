class Student{
    int rollno;
    String name;
}

public class Array{
    public static void main(String a[]){
        int num1[]= {3,7,2,4};
        num1[2]=1;

        int num2[]= new int[4]; //by default val=0
        for(int n : num1) System.out.print(n);
        for(int i=0; i<4; i++) System.out.print(num2[i]+" ");

        System.out.println();

        int num3[][]= new int[3][4];  //2D array
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++)
                System.out.print(num3[i][j]);
            System.out.println();
        }

        int num4[][]= new int[3][]; //jagged array- internal array are of varying sizes
        num4[0]= new int[3];
        num4[1]= new int[4];
        num4[2]= new int[2];

        for(int i=0; i<num4.length; i++){
            for(int j=0; j<num4[i].length; j++)
                num4[i][j]= (int)(Math.random()*10);
        }

        for(int n[]: num4){
            for(int m : n)
                System.out.print(m+" ");
            System.out.println();
        }

        Student s1= new Student();
        s1.rollno=1;
        s1.name="Pearl";

        Student s2= new Student();
        s2.rollno=2;
        s2.name="Shikha";

        Student s3= new Student();
        s3.rollno=3;
        s3.name="Nimrit";
        
        Student students[]= new Student[3]; //array which can hold Student refernces
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for(int i=0; i<3; i++){
            System.out.print(students[i].rollno + students[i].name+ " ");
        }
    }
}