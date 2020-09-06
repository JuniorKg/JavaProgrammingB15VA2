package REBOOTCAMP.day4_OOP;

public class ClassOne implements Teachable, Moveable {

    static int size = 0;
    @Override
    public void teachMath() {
        System.out.println(Teachable.size);
    }

    @Override
    public void moveTo(){

    }




}
