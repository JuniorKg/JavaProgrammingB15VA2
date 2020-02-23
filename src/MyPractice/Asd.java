package MyPractice;
import java.util.*;
public class Asd {
    public static void main(String[] args) {

        /*
        Print true if the string "cat" and "dog" appear the same number of times in the given string word.
         */

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i < word.length() - 3; i++) {
            word = word.substring(0, i + 3);
            if (word.equals("cat")) {
                countOfCats++;
                if (word.equals("dog")) {
                        countOfDogs++;
                    }
                    System.out.println(countOfCats == countOfDogs);
                }
            }
        }
    }


