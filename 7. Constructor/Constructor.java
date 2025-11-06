class Human {
    private int age;
    private String name;

    //Default Cons
    public Human(){
        age= 12;
        name="";
        System.out.println("Default Constructor called");
    }

    // Parameterised Cons
    public Human(int a, String n){
        age= a;
        name=n;
        System.out.println("Parameterized Constructor called");
    }


    public void setAge(int a) {
        this.age= a;
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

public class Constructor {
    public static void main(String[] args) {
        Human h= new Human(18,"Pearl");
        // everytime object is created Cons is called
        System.out.println(h.getAge() + ": " + h.getName());
    }
}
