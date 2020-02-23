package day06_operators;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name?");
        String fullName = scan.nextLine();

        System.out.println("Code Java - " +fullName + " is coding Java");

        System.out.println("Enter address: ");
        String address =scan.nextLine();

        System.out.println(fullName+ " lives in " + address);






    }
}
