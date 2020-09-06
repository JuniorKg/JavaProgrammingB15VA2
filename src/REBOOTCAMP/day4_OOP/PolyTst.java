package REBOOTCAMP.day4_OOP;

public class PolyTst {

    public static void main(String[] args) {


        A a = new C();
        B b = new C();
        C c = new C();
        Extra e = new C();


        c.m();
        b.m();
        a.m();

        System.out.println(c.s);
        System.out.println(b.s);
       // System.out.println(a.s);

        System.out.println(c.num);
        System.out.println(b.num);

        e.m2();
        c.m2();
        //b.m2(); does not work no implementation of interface


        B b2 = c;
        C c2 = (C)b;





    }
}