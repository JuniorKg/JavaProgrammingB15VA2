package day12_ternary_string_manipulation;
import java.util.Scanner;
public class CapitalCity {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the capital of Turkey?");
        String capital = scan.next();

        if (capital.equalsIgnoreCase("Ankara")){
            System.out.println("Your Answer is correct!");
        } else {
            System.out.println("Your answer is wrong");

        }
    }
}
