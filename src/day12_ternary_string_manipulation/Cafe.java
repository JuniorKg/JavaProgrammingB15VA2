package day12_ternary_string_manipulation;

public class Cafe {
    public static void main(String[] args) {

        String order = "drink", drink = "soda", food ="soup";
        double price = 0;

       if (order.equals("drink") &&  drink.equalsIgnoreCase("soda")) {
           price = 1.99;
           System.out.println("Price is: " + price);
       }else if (order.equals("drink") && drink.equalsIgnoreCase("coffee")){
           price = 4.99;
           System.out.println("Price is:" + price);
       }else if (order.equalsIgnoreCase("drink") && drink.equalsIgnoreCase("water")){
           price = 1.55;
           System.out.println("Price is: " +price);

       }else if (order.equalsIgnoreCase("food") && food.equalsIgnoreCase("sandwich")){
           price = 7.45;
           System.out.println("Price is: " +price);

       }else if (order.equalsIgnoreCase("food") && food.equalsIgnoreCase("soup")){
           price = 6.33;
           System.out.println("Price is: " +price);

       }else if (order.equalsIgnoreCase("food") && food.equalsIgnoreCase("salad")) {
           price = 9.99;
           System.out.println("Price is: " + price);
       }else {
           System.out.println("Wrong Input");



       }


        System.out.println("Total price: " +price);


    }
}
