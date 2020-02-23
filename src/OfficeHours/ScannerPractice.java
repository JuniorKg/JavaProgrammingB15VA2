package OfficeHours;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite city: ");

        String city = scanner.next();

        System.out.println("My favorite city is: " +city);

        System.out.println("Please enter you favorite country: ");

        String country = scanner.next();

        System.out.println("My favorite country is: " +country);

        System.out.println("Enter 2 numbers: ");
        String number1 = scanner.next();
        String number2 = scanner.next();
        System.out.println(number1+" "+number2);

        //to rename variable -> right click on name -> refractor -> rename
        //it will change the name of variable in the whole file

        //print: I love "Java"

        System.out.println("I love \"Java\"");








    }
}
