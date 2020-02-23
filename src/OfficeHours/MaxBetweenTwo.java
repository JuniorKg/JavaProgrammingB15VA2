package OfficeHours;
import java.util.Scanner;
public class MaxBetweenTwo {
    public static void main(String[] args) {

        /*
        ask user to enter 4 numbers
        calculate sum odd
        calculate sum even
        compare and print greatest
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 4 numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int sumOdd = 0;

        int sumEven = 0;

        if (num1 % 2 == 0) {
            sumEven += num1;

        } else {
            sumOdd += num1;
        }

        if (num2 % 2 == 0) {
            sumEven += num2;

        } else {
            sumOdd += num2;

        }

        if (num3 % 2 == 0) {
            sumEven += num3;

        } else {
            sumOdd += num3;
        }
        if (num4 % 2 == 0) {
            sumEven += num4;

        } else {
            sumOdd += num4;
        }
        if (sumEven>sumOdd){
            System.out.println("Max sum is sum of even: " + sumEven);
        }else if (sumOdd>sumEven){
            System.out.println("Max sum is sum of Odd:" +sumOdd);
        }else{
            System.out.println("Values are equal: " +sumEven);
        }
    }
}