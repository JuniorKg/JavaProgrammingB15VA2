package day06_operators;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter Fahrenheit value");

        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in celsius is " +celsius);

        System.out.println("########## C TO F ##########");

        // F = (C* 9/5) +32

        System.out.println("Enter Celcius value");

        celsius = input.nextDouble();

        celsius = (celsius*9/5)+32;

        System.out.println("Temperature in F is " +celsius);

       ;





    }
}
