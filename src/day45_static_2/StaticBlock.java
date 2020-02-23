package day45_static_2;

public class StaticBlock {


    //static block
    static{
        System.out.println("STATIC BLOCK - ONCE BEFORE EVERY");
    }
    public StaticBlock (){
        System.out.println("CONSTRUCTOR");
    }

    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
    public static class InnerClass{

    }
}
