package day06_operators;
import java.util.Scanner;
public class Days {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int days = scan.nextInt();
        int minutes = days * 1440;
        System.out.println(minutes + " minutes");

    }
}
