package day05_practice_scanner_math;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter!");
        System.out.println("How much are potatoes?");

        double potatoes = input.nextDouble();

        System.out.println("How much are tomatoes?");

        double tomatoes = input.nextDouble();

        System.out.println("How much are eggplants? ");

        double eggplants = input.nextDouble();

        System.out.println("Your total is " + (potatoes+tomatoes+eggplants));



    }
}
