package MyPractice;
import java.util.*;
public class Assign35 {
    public static void main(String[] args) {
        /*
        Let's say I've got a $100 gift card and you want to buy something in your online store .
        Write a program that will help me to buy something and display
         leftover balance after purchase. If item is not in the list,
         display message: "Invalid item!". If price is more than $100,
         display message: "Sorry, not enough funds on your gift card!".
         */


        Scanner scan = new Scanner(System.in);

        String item = scan.next();

        int currentBalance = 100;

            if (item.equalsIgnoreCase("Charger")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 15));
            } else if (item.equalsIgnoreCase("USB cable")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 10));
            } else if (item.equalsIgnoreCase("HeadPhones")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 30));
            } else if (item.equalsIgnoreCase("Pants")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 50));
            } else if (item.equalsIgnoreCase("Hat")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 25));
            } else if (item.equalsIgnoreCase("Socks")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 5));
            } else if (item.equalsIgnoreCase("Blanket")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 60));
            } else if (item.equalsIgnoreCase("Pillow")) {
                System.out.println("Thank you for your purchase");
                System.out.println("Your current balance is: " + (currentBalance - 50));
            } else if (item.equalsIgnoreCase("Smartphone")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else if (item.equalsIgnoreCase("Laptop")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                System.out.println("Invalid Item");

            }
        }
    }








