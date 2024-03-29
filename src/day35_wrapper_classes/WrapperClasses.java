package day35_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num = new Integer(10);
        Integer num2 = 33;

        System.out.println("num = "+ num);
        System.out.println("num2 = " + num2);
        
        int num3 = 44;
        
        String strNum = num.toString();
        System.out.println("strNum = " + strNum);

        System.out.println(Integer.sum(40,33));
        System.out.println(Integer.max(40,33));
        System.out.println(Integer.min(33,5));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        /*
        first larger than second -> 1
        equals -> 0
        first is less than second -> -1
         */

        System.out.println(Integer.compare(10,5));
        System.out.println(Integer.compare(10,10));
        System.out.println(Integer.compare(10,12));

        //CONVERT STRINGS INTO INT
        String countStr = "3456";
        int intCount = Integer.parseInt(countStr);
        int intCount2 = Integer.valueOf(countStr);



    }
}
