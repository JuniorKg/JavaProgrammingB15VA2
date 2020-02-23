package day36_wrapper_arraylist;

public class CastingWithWrappers {
    public static void main(String[] args) {
        int intValue = 123;
        double doubleValue = intValue;

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        Integer wrapperInt = Integer.valueOf(100);
        Double wrapperDouble = (double)wrapperInt; // Unboxing > Casting > Autoboxing
        //Double wrapperDouble = wrapperInt; ERROR: CANNOT CAST AMONG WRAPPERS

        System.out.println("wrapperInt = " + wrapperInt);
        System.out.println("wrapperDouble = " + wrapperDouble);



    }
}
