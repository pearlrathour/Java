// https://youtu.be/k_SJOnVa_G0?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5

class Human {
    private int age;
    private String name;

    public void setAge(int a) {
        //a is local variable & age is instance variable
        age = a; //age= 20
        // age= age //age=0

        // Human obj= new Human();
        // obj.age= age;
        // but new object and og stil has age=0
        this.age= age; //age=20
    }

    public void setAge1(int age, Human obj) {
        obj.age= age;
        // method of same object so no need to pass obj
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class This {
    public static void main(String a[]) {
        Human h = new Human();
        h.setAge(20);
        h.setName("Pearl");
        System.out.println(h.getAge() + " " + h.getName());
    }
}
