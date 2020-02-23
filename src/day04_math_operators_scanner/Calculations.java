package day04_math_operators_scanner;

public class Calculations {
    public static void main(String[] args){
        double price1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;

        double totalPrice = price1 + price2 + price3;

        System.out.println("Total price is: " +totalPrice);

        double balance = 1200.0;
        double remainingBalance = balance -totalPrice;
        System.out.println("RemainingBalance: "+ remainingBalance);

        //declare variable int linesOfCode and assign 25;
        //declare variable int classCount and assign 6;
        //calculate how many lines of code written and print out;

        int linesOfCode = 25;
        int classOfCount = 6;


        System.out.println(linesOfCode*classOfCount);
        System.out.println("Total lines of code: " +linesOfCode*classOfCount);



        int totalLinesOfCode = linesOfCode * classOfCount;

        System.out.println("Total Lines Of Code: " +totalLinesOfCode);










    }
}
