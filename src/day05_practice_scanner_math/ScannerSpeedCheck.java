package day05_practice_scanner_math;
import java.util.Scanner;
public class ScannerSpeedCheck {
    public static void main(String[] args){
        //create Scanner Object
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Speed Check Program");
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();
        //System.out.println("Current speed: " + currentSpeed);
        int speedLimit = 55;
        int overTheLimit = currentSpeed-speedLimit;
        System.out.println("You are driving " +overTheLimit + " mph over the limit");







    }
}
