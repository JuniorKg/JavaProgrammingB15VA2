package day45_static_2;

public class VariableAccess {
    int instanceCount = 10;

    static int staticCount = 15;

    public static void main(String[] args){

        VariableAccess vbObj = new VariableAccess();
        System.out.println(vbObj.instanceCount);
        vbObj.nonStaticInstanceMethod();
    }

    public static void staticMethod(){
        System.out.println("InstanceCount: ");
        System.out.println("StaticCount:" + staticCount);
    }

    public void nonStaticInstanceMethod(){
        System.out.println("instanceCount = " +instanceCount);
        System.out.println("staticCount = " + staticCount);

        //method access

        staticMethod();
        //nonStaticInstanceMethod(); ERROR

        //HOW TO ACCESS INSTANCE(NON - STATIC) VARIABLES / METHOD
        //first create object using NEW keyword

    }

}
