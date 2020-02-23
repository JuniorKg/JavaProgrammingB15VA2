package MyPractice;
import java.util.*;
public class FindUnique {
    public static void main(String[] args) {

        System.out.print(unique("AAVVSER"));




    }
    /**
     * Write a return  method that can find the unique characters from the String
     * <p>
     * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String unique(String str) {

        String[] arr = str.split("");

        String unique1 = "";

        for (int i = 0; i < arr.length; i++) {

            int num = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j].equals(arr[i]))

                    num++;

            }

            if (num == 1)

                unique1 += arr[i];

        }

        return unique1;

    }
}