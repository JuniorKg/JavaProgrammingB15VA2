package REBOOTCAMP.day4_OOP;

public class Mini extends Car {


    static void m1() {
        System.out.println("C");
    }

    static void m2() {
        System.out.println("D");
    }

    public static void main(String[] args) {

        Car c = new Mini();
        c.m1(); //a
        c.m2(); //b
        Mini.m1(); //c
        Mini.m2(); //d
        ((Mini)c).m1(); //c
        ((Mini)c).m2(); //d
    }
}