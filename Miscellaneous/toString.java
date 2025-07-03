package Miscellaneous;
class Laptop{
    int price;
    String brand;

    public String toString(){
        // return "Subclass toString()";
        return brand + ": " + price;
    }

    // public boolean equals(Laptop that){
    //     return this.brand.equals(that.brand) && this.price==that.price? true : false;
    // }

    // @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    // @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }
    
}

public class toString {
    public static void main(String[] args) {
        Laptop obj1= new Laptop();
        obj1.brand= "Lenovo";
        obj1.price= 70000;
        System.out.println(obj1); // by default calls toString() method of Objetc class
        // returns class name
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());

        Laptop obj2= new Laptop();
        obj2.brand= "Lenovo";
        obj2.price= 70000;

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
