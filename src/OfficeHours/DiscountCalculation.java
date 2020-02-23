package OfficeHours;
import java.util.Scanner;
public class DiscountCalculation {
    public static void main(String[] args) {

        /*
        ask the user to select product
        ask the user to enter the price
        ask the user to enter the quantity

        based on the total price * quantity calculate discount and print the total:
        if our 100.00 = no discount
        if it is 101.00-300.00 = 10%
        if it is between 301.00 or more = 20%
         */

        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter the product you want to purchase:");
        String productName = scan.next();
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double totalBeforeDiscount = quantity*price;
        double discount = 0.00;

        if (totalBeforeDiscount <= 100) {
            System.out.println("Sorry, there is no discount for you. Try to spend more money!");
            System.out.println("You need to spend $" + (101 - totalBeforeDiscount));
            System.out.println("Your total is $:" + totalBeforeDiscount);

        }else if (totalBeforeDiscount >= 101 && totalBeforeDiscount <=300){
            System.out.println("Your discount is 10%");
            System.out.println("You need to spend $" + (301 - totalBeforeDiscount));
            discount = totalBeforeDiscount * 0.1;
            System.out.println("Your total is $" + (totalBeforeDiscount - discount));
        }else {
            System.out.println("Your discount is 20%");
            discount = totalBeforeDiscount*0.2;
            double total = totalBeforeDiscount-discount;
            System.out.println("Your total is $" +total);



        }


    }
}
