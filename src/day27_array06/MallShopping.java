package day27_array06;
import java.util.*;
public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "Iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        if (items.length == prices.length && prices.length == itemIDs.length) {
            System.out.println("They all are equal");
        } else {
            System.out.println("ERROR: Array Length mismatch! Quitting the program");
        }

        //TASK 2. Print how many items purchased

        System.out.println(items.length);

        //TASK 3. Print a receipt report.

        /*
        12345 - Shoes - $99
        ...
        458.8 * 0.6 + 458.8
        Total price : 458.8(include tax)

         */

        double totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemIDs[i] + " - " + items[i] + " - " + prices[i]);
            totalPrice += prices[i];

        }
        System.out.println("Total price: $" + (int) (totalPrice * 1.06));

        //TASK 4. Find Airpods and print along with price and itemID

        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("Airpods")) {
                System.out.println(items[i] + " ->  " + prices[i] + " -> " + itemIDs[i]);
                break;
            }
        }
            double maxPrice = prices[0];
            int maxPriceIndex = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i];
                    maxPriceIndex = i;
                }
            }
                System.out.println("Most expensive item: ");
                System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " -> " +maxPrice);
            }
        }









