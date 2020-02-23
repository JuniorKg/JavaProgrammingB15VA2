package OfficeHours;
import java.util.*;
public class Office_Hours_Jan6 {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Strawberry");

        /*
           Create an ArrayList type String (name fruits)
                add 4 Strings to it
                find the size and print it
                add one more String
                print ArrayList
                remove last element from list
                set 1st element to "Lemon"
                check if "Apple" is in the list
                sort the list
                print list
                reverse list
                print list
         */

        System.out.println(fruits.size());

        fruits.add("Lemon");

        System.out.println(fruits);

        fruits.remove(4);
        System.out.println(fruits);

        fruits.set(0, "Lemon");
        System.out.println(fruits);


        System.out.println(fruits.contains("Apple"));

        //Sorting Arrayslist using Collections class
        Collections.sort(fruits);
        System.out.println(fruits);

        //Reversing Arrayslist
        Collections.reverse(fruits);
        System.out.println(fruits);

        /*
         Switch 2nd and last elements in ArrayList
         */

        //[Strawberry, Lemon, Kiwi, Banana]
        String temp = fruits.get(1); //Lemon
        //set 2nd element to "Banana"
        fruits.set(1, fruits.get(fruits.size()-1));// (1, Banana)
        System.out.println(fruits);
        fruits.set(fruits.size()-1, temp); // (3, Lemon )
        System.out.println(fruits);

        /*
            count how many Lemons there are in the list
         */

        //loop and count
        //get size, remove Lemon, get size again -> find the result of subtraction



    }
}