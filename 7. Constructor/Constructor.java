class Human {
    private int age;
    private String name;

    //Default Cons
    public Human(){
        age= 12;
        name="";
        // name is "" instead of null now
    }

    // Parameterised Cons
    public Human(int a, String n){
        age= a;
        // name= name; // name= null;
        name=n;

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
