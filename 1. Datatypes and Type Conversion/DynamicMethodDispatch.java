class Computer {
    public void show() {
        System.out.println("Computer show");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("Laptop show");
    }
}

class Macbook extends Computer {
    public void show() {
        System.out.println("Macbook show");
    }
}

class D {

}

// Runtime Polymorphism
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Computer obj = new Laptop(); // ref of superclass & obj of subclass
        obj.show();

        // first it will check computer then laptop
        // if Laptop has show -> Laptop show
        // else Computer show

        // Dynamic Method Dispatch
        Computer obj1 = new Computer();
        obj1.show();
        obj1 = new Laptop();
        obj1.show();
        obj1 = new Macbook();
        obj1.show();

        // obj1= new D();
        // will give err as D is not extending A i.e. no inheritance

        // Laptop a = new Laptop() ;

        // isme object child ka reference child ka
        // kuch call krenge toh wo phle a child mai check krega koi method mil gya to
        // phr wo upr jaake parent mai dekhega ki kuch inherit huya kya

        // Computer a = new Laptop() ;

        // isme object child ka aur reference parent ka
        // kuch method call krenge to phle parent mai check krega ki hai kya
        // if parent mai nhi to error
        // if parent mai hai to jiska object hai uss tk jaake dekhenge ki override huya
        // hai kya

        // Computer a = new Computer() ;

        // parent ka reference aur parent ka object
        // sirf parent ke methods chl paayenge

        // to use laptop method
        // downcasting
        // Laptop obj = (Laptop) a
    }
}
