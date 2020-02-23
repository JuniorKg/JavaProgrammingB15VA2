package OfficeHours;
import java.util.Scanner;
public class ConditionsPractice {
    public static void main(String[] args) {
        //we create on objet of Scanner class
        //to get input from keyboard
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Score: ");

        int score = scanner.nextInt();
        //if score is greater than 75, then print passed
        //otherwise, print failed
        if(score>75) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
