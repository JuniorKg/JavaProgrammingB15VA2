package day06_operators;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String [] args){


    int cents = 250;
    int dollars = cents/100; //calculate dollars
    int remainingCents = cents % 100; //calculate remaining cents

        System.out.println(dollars + "dollars and "+"remaining cents"+remainingCents);



    }
}
