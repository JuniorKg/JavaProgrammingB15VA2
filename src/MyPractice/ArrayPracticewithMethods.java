package MyPractice;
import java.util.*;
public class ArrayPracticewithMethods {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Juma's world");



        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i < words.length ; i++) {
            if (words.length > 2){
                    System.out.println(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));

            }

        }



    }
}
