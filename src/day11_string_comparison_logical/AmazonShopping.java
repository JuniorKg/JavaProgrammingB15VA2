package day11_string_comparison_logical;
import java.util.Scanner;
public class AmazonShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        System.out.println("Welcome to Amazon Shopping!");
        System.out.println("Are you a prime member?");
        String answer =scan.next();
        Boolean isPrimeMember;
        System.out.println("Enter total order price:");
        double totalOrderPrice = scan.nextDouble();


        if(answer.equalsIgnoreCase("yes")) {
            isPrimeMember = true;
        }else{
            isPrimeMember = false;



        }


        if (isPrimeMember || totalOrderPrice >= 25.0){
            System.out.println("Your order is eligible for free shipping");
        } else {
            System.out.println("Your order is not eligible for free shipping");
        }

    }
}
