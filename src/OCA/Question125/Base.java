package OCA.Question125;

public class Base {
    public void test(){
        System.out.println("Base");
    }
}

class DerivedA extends Base{
    public void test(){
        System.out.println("DerivedA");
    }
}
class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;
        b1 = (Base) b2;
        b1.test();
        b4.test();

        /**
         * In this case object b4 changes its reference in memory to b4, thus it equals to "DerivedB"
         * Second case b1 changes its reference in memory to b2, therefore it equals "Derived A"
         *
         * So the output in this question is :
         * DerivedA
         * DerivedB
         */
    }
}

