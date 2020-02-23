package day21_forloop_4_arrayintro;
import java.util.*;
public class FindUniqueChars {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter word:");
    String str = scan.nextLine();


        //String str = "jjaavvaa";
        String unique = ""; //jav

        //loop from beginning until end of str
        for (int n = 0; n < str.length(); n++) {
            String temp = str.charAt(n) + "";
            System.out.println("temp = " + temp);
        if (!unique.contains(temp)) {
            // add temp to unique
            unique+= temp;
        } 
        }
        System.out.println("unique = " + unique);
    }
}