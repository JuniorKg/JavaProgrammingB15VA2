package day35_wrapper_classes;
import java.util.*;
public class MethodsWithArrayReturn {
    public static void main(String[] args) {
        getDays();
        String[] strArr = getDays();
        System.out.println(Arrays.toString(strArr));

        System.out.println(Arrays.toString(getDays()));

    }


    public static String[] getDays() {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return days;
    }
}

