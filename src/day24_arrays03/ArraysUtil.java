package day24_arrays03;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        
        // Arrays.toString();
        //Arrays.sort()
        //Arrays.equals()
        
        double [] nums =  {22.4, 14.99, 15.25, 16.24, 56,99};

        System.out.println(Arrays.toString(nums));

        //char arraym and assign Your name to the array;
        char [] myName = {'J','u','m', 'a'};

        System.out.println(Arrays.toString(myName));

        //string array. Days = "Mon, Tue, Wed, Thur, Fri, Sat, Sun

        String []days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        //print days values in same line

        System.out.println(Arrays.toString(days));
        System.out.println(Arrays.toString(days).toLowerCase());




        
    }
}
