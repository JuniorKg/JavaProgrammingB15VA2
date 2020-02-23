package day12_ternary_string_manipulation;

public class Cafe_NestedIF {
    public static void main(String[] args) {
        String order = "drink", drink = "soda", food = "soup";
        double price = 0;

        if (order.equalsIgnoreCase("drink")) {
            if (drink.equalsIgnoreCase("soda")) {
                price = 1.99;
            } else if (drink.equalsIgnoreCase("coffee")) {
                price = 4.99;
            } else if (drink.equalsIgnoreCase("water")) {
                price = 1.55;
            } else {
                System.out.println("No such drink available");

            }
        } else if (order.equalsIgnoreCase("food")) {
            if (food.equalsIgnoreCase("sandwich"))
                price = 7.45;
        } else if (food.equalsIgnoreCase("soup")){
            price = 6.55;
     } else if (food.equalsIgnoreCase("salad")) {
            price = 9.99;
        }else {
            System.out.println("No such food available");
        }
        System.out.println("Total price: " +price);
    }
}
