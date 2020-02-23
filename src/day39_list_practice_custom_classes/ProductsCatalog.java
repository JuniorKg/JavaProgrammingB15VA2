package day39_list_practice_custom_classes;
import day37_arraylist.ArraysAsList;

import java.util.*;
public class ProductsCatalog {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("Iphone 6s", "Iphone 6s Plus", "Iphone X", "MacbookPro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"));
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(449.0, 549.0, 1149.0, 1499.99, 39.99, 349.99, 79.99, 39.99, 429.0, 399.0, 2199.0, 559.0));
        ArrayList<Double> monthlyPayments = new ArrayList<>(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18));

        //print each list .

        System.out.println(items.toString());
        System.out.println(prices.toString());
        System.out.println(monthlyPayments.toString());

        //TASK 1. Print whole catalog [Iphone 6s - 449.0 - 18.71]
        //Print first with index 0 ;
        //Then print with loop;

        System.out.println(1 + ". [" + items.get(0) + " - " + prices.get(0) + " - " + monthlyPayments.get(0) + "]");

        String catalog = "";
        for (int i = 0; i < items.size(); i++) {
            // i + 1 to make a count for each item
            System.out.println(i + 1 + ". [" + items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i) + "]");

        }
        //TASK 2. Declare Arraylist Whole Catalog and add all items info to it
        //by concatenating it

        ArrayList<String> wholeCatalog = new ArrayList<>();


        for (int i = 0; i < items.size(); i++) {
            wholeCatalog.add("[" + items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i) + "]");
        }
        System.out.println(wholeCatalog);

        /*
        Task. 3. String item = "Dyson Vacuum"
        Look for the item in the items list, then print out:
        Dyson Vacuum | 399.0 | 16.25
         */
        String item = "Dyson Vacuum";
        if (items.contains(item)) {
            //Find the index of the item in the items list then print all details
            int index = items.indexOf(item);
            System.out.println(items.get(index) + " | " + prices.get(index) + " | " + monthlyPayments.get(index));
        } else {
            System.out.println("Dyson Vacuum is not found!Keep Coding Java");
        }


        for (int i = 0; i < items.size(); i++) {
            if (items.contains(item)) {
                int index = items.indexOf(item);
                System.out.println(items.get(i) + " | " + prices.get(i) + " | " + monthlyPayments.get(i));
            } else {
                System.out.println("Dyson Vacuum is not found!Keep Coding Java");
            }
        }
                //TASK 4. UpdatePrice for item
                //String product = "TV";
                //Double prices = 1099.0
                //Find the product index in items, the update the prices in prices list
                
            String product = "TV";
            Double newPrice = 1099.0;
            
            if (items.contains(product)){
            int indexOfproduct = items.indexOf(product);
             prices.set(indexOfproduct, newPrice);
            System.out.println(items.get(indexOfproduct)+ " new prices: "+ prices.get(indexOfproduct));
        }else {
            System.out.println("TV is not found!Keep Coding Java");

                }

            /*
            TASK 5. delete item from catalog
            String prodToDelete = "ThumbDrive";
            Find the index of prodToDelete and remove it from
             */
        System.out.println("TASK 5 ======================");
             String prodToDelete = "ThumbDrive";
            if (items.contains(prodToDelete)){
                int idx = items.indexOf(prodToDelete);
                items.remove(idx);
                prices.remove(idx);
                monthlyPayments.remove(idx);
                System.out.println((prodToDelete + " is still there? " + items.contains(prodToDelete)));
            }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).toLowerCase().contains("iphone")) {
                System.out.println("iPhone Found at indext " + i);
                items.remove(i);
                i--;

            }
        }
        System.out.println(items);

        for (int i = 0; i < items.size() ; i++) {
            if (prices.get(i) < 500) {

                System.out.println(items.get(i) +" | " +  prices.get(i) + " | " + monthlyPayments.get(i));

            }
        }


        // TASK 8 .find the most expensive item and printout
        double expensive = prices.get(0);
        int expIdx = 0;
        for (int i = 0; i < prices.size(); i++) {
            if(prices.get(i) > expensive){
                expensive = prices.get(i);
                expIdx = i;
            }
        }
        System.out.println("[" + items.get(expIdx) + " - " + prices.get(expIdx) + " - " + monthlyPayments.get(expIdx) + "]");

        //TASK 9. find the least expensive item and printout
        double cheapestPrice = prices.get(0);
        int cheapestIdx = 0;
        for (int i = 0; i < items.size(); i++) {
            if(prices.get(i) < cheapestPrice){
                cheapestPrice = prices.get(i);
                cheapestIdx = i;

            }
        }
        System.out.println("[" + items.get(cheapestIdx) + " - " + prices.get(cheapestIdx) + " - " + monthlyPayments.get(cheapestIdx) + "]");

            /*
            IQ: ARRAY VS ARRAYLIST
                -> Array is fixed size(cannot remove or add)
                -> ArrayList is re-sizable - we can remove or add new items anytime
                -> Array can store primitives and objects:
                    int[] nums = new int[10];
                    Integer[] nums = new Integer[10];
                    String[] strArr = new String[10];
                -> ArrayList can only store objects
                    ArrayList<Integer> nums = new ArrayList<>();
                    ArrayList<String> nums = new ArrayList<>();
                -> Array is built into java as a data structure
                -> ArrayList is array based class that comes from java.util package and it is part of Java COLLECTIONS framework.
                -> Array does not have many useful methods
                -> ArrayList comes with several manipulation methods
                -> Array can be printed using Arrays.toString method
                -> ArrayList can be printed directly using toString method
                -> Array can be MULTI- Dimensional
                -> ArrayList cannot be multi-dimensional
                ====================
                ArrayList<Integer> l = new ArrayList<>();
                l.size() => 0
                --------
                When we declare Empty arraylist, it internally creates an array with defaul size of 10.
                ArrayList is Array based. Internally it is using Arrays to perform all the operations.
                ArrayList is Dynamic Array, re-sizable array.
==============================================
             */

















    }
}


