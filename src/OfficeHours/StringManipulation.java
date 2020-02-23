package OfficeHours;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        /*
        enter 2 words - Scanner 
        if length is >5
        replace 4th index with * in 1st word
        everything after 4th index - replace w/ 2nd word
        if less than 5:
        concat first half of 1 st word with
        2nd half of second word
        (if not even - take bigger part)
         */
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter word 1");
        String word1 = scanner.next();
        System.out.println("Enter word 2");
        String word2 = scanner.next();
        
        int w1Length = word1.length();
        
        /*
            Umbrella -> Umbre*lla
         */
        
        if (w1Length > 5) {
            char char4 = word1.charAt(4); //getting a char at index 4
            //   word1 = word1.replace(char4, '*');
            // System.out.println("char4 = " + word1);

            word1 = word1.substring(0, 4) + "*" + word2;

          /*
           substring() - cut
           substring(startPoint) - cut from start point to the end;
           substring(startIndex, endIndex) - cut from the start to end
           endIndex is not included
           */

            System.out.println("word1 " + word1);

      //  }else if
            /*
            pine /4   Floor / 5/2 -> 2
            trees
            -> piees
             */
            int w1L = word1.length();
            int w2L = word2.length();
            String part1 = word1.substring(0, w1L/2);
            if (w1L%2 ==0) {
                part1 = word1.substring(0, w1L / 2);
            }else {
                part1 = word1.substring(0, w1L/2+1);
            String part2 = word2.substring(w2L/2);


            }


        }
        
        
    }
}
