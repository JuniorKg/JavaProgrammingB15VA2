package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class Multiplier {
    public static void main(String[] args) {

        System.out.println("Welcome to Multiplier!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = num1*num2;


        System.out.println(num1+" x "+num2+" = "+result);





    }
}
