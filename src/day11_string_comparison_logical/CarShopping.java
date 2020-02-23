package day11_string_comparison_logical;
import java.util.Scanner;
public class CarShopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our Car Dealership!");
        String carModel = "toyota";
        int carPrice = 0;
        int budget = 25000;

        System.out.println("Enter model");
        carModel = scan.next();
        System.out.println("Enter price");
        carPrice = scan.nextInt();

        if (carModel.equals("toyota") || carModel.equals("bmw") || carModel.equals("audi") || carModel.equals("tesla") && carPrice <= budget) {
            System.out.println("I am interested in purchasing this car!");
        }else {
            System.out.println("I am not interested in this car");

        }
    }
}
