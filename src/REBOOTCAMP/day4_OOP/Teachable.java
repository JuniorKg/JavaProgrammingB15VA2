package REBOOTCAMP.day4_OOP;

public interface Teachable {

    int size = 20;


    void teachMath();


    public static void print() {
        System.out.println(5);
    }

    public default void print2(){
        System.out.println(10);

    }
}
