package OfficeHours;
import java.util.Scanner;
public class FlowerShop {
    public static void main(String[] args) {
        /*
        choices:
        1 - rose
        2 - lily
        3 - tulips
        4 - orchids

        price list :

        1 - $2.00
        2 - $2.20
        3 - $1.90
        4 - $2.50


        ask user:
        budget - double - Scanner
        quantity - int - Scanner
        choice - int - Scanner

        task:

        1. Based on choice, quantity, price -> calculate
         total cost
        2. Based on total cost and budget -> print the message if buyer can afford it
        3. Based on budget and selection ->
            - if budget > total cost = print change
            - if budget < total cost = calculate based on selection
            how many flowers we can afford
            -if budget = total = say = say you are on budget
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your selection");
        System.out.println("Press 1 for Rose, Press 2 for Lily, Press 3 for Tulips, Press 4 for Orchids");

        int choice = scan.nextInt();

        double rosePrice = 2.00;
        double lilyPrice = 2.20;
        double tulipPrice = 1.90;
        double orchidPrice = 2.50;

        System.out.println("Please Enter quantity");
        int quantity = scan.nextInt();
        System.out.println("Please Enter you budget");
        double budget = scan.nextDouble();

        double total = 0;
        double pricePerUnit =0;

        if (choice == 1) {
            total = rosePrice * quantity;
            pricePerUnit = rosePrice;
        } else if
            (choice == 2){
            total = lilyPrice * quantity;
            pricePerUnit = lilyPrice;
        }else if (choice ==3) {
            total = tulipPrice * quantity;
            pricePerUnit = tulipPrice;
        }else if (choice==4) {
            total = orchidPrice * quantity;
            pricePerUnit = orchidPrice;
        }else {
            System.out.println("You selected the wrong item");
        }

        double balance = budget-total;

        if (balance >=0) {
            System.out.println("You have enough money to buy flowers");

        }else {
            System.out.println("You dont have enough money to buy flowers");
        }

        if (balance>0){
            System.out.println("Your change is: " +balance);
        }else if (balance==0){
            System.out.println("You are on budget");
        }else{
            int flowerscount = (int)(budget/pricePerUnit);
        System.out.println("With your budget you can buy " +flowerscount);

        }



    }
}
