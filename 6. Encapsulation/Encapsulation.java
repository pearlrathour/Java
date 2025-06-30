class Human{
    int age;
    String name;
    private String address;

    public void setAd(String ad){
        address= ad;
    }

    public String getAd(){
        return address;
    }
}

public class Encapsulation {
    public static void main(String a[]){
        Human h= new Human();
        h.age= 18;
        h.name= "Tushar";
        // h.address= "gdjhewjkf";  //error accessing pvt instance variable
        h.setAd("fjkrhkjgn");
        System.out.println(h.name + "-" + h.age + "-" + h.getAd());
    }
}
