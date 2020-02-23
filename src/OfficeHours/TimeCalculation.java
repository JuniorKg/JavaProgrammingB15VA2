package OfficeHours;
import java.util.Scanner;
public class TimeCalculation {
    public static void main(String[] args) {
        /*
        ask user to enter number from 0 to 24 - military time
        num>12 = pm
        num<= 12 = am
        print the time in Standard format (14 -> 2 pm; 5 -> 5 am)
         */
       Scanner scan = new Scanner (System.in);

        System.out.println("Please enter military time (number from 0 to 23)");

        int time = scan.nextInt();

        if (time>=12) {
           // System.out.println("Standard time is: " + (time - 12) + "PM" );
            System.out.println("Standard time is: " +(time%12) + "PM"); // WITH REMAINDER
        }else if (time > 0 && time<12)
        {
            System.out.println("Standard time is: " + time + "AM");
        }else if (time ==0) {
            System.out.println("Standard time is: 12AM");
        }else{
            System.out.println("You entered wrong number. Time should be between 0 and 23");


        }
    }
}
