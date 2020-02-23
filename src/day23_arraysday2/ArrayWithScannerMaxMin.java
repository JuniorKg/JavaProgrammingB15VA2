package day23_arraysday2;
import java.util.*;
public class ArrayWithScannerMaxMin {
    public static void main(String[] args) {
        //The are miltiple teams each has score between 0-100.

        //Create an array that cab store score of 5 times.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 team scores:");


        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter team " + (i+1) + " score");
            scores[i] = scan.nextInt();
            // or this option - int score = scan.nextInt();
            // scores[i] = score;

            //print all score in one line
        }

        for (int scoreach : scores) {
            System.out.print(scoreach + " ");

        }
        System.out.println();
        //find the max/largest score
        int max = 0;

        for (int i = 0; i < scores.length; i++) {
            //System.out.println(scores[i]);
            if (scores[i] > max) {
                max = scores[i];

            }

           // System.out.println("maximum score = " + max);
        }

        int min = scores[0]; // assign first one is min and assign

        for (int num : scores) {
            //System.out.println(scores[i]);
            if (num < min) {
                min = num;


            }


        }
        System.out.println("min = " + min);
    }
}
