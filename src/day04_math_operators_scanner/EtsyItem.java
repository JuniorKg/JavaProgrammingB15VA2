package day04_math_operators_scanner;

public class EtsyItem {
    public static void main(String[] args){
        String title = "Soup Cook Off Personalized Wooden Spoon";
        String seller = "PersonalizedGallery";
        double stars = 5.0;
        int ratingsCount = 8901;
        double price = 8.00;
        boolean bestSeller = true;
        boolean freeShipping = true;

        System.out.println("Item title is " +title);
        System.out.println("Seller name is <" +seller+">");
        //Product has 5.0 stars
        System.out.println("Product has " +stars+" stars");
        //Product has 8901 ratings!
        System.out.println("Product has " +ratingsCount+ " ratings!");
        //Price is $8.00
        System.out.println("Price is $"+price);
        //Best seller is true
        System.out.println("Best seller is " +bestSeller);
        //Is it free shipping? -true Great!
        System.out.println("Is it free shipping? -" +freeShipping + " Great!");

        //*********************************************************
        //city1, city2, ticketPrice

        String city1 = "New York";
        String city2 = "Chicago";
        Double ticketPrice = 285.99;

        //From New York to Chicago is $285.99

        System.out.println("From " +city1 + " to " +city2 + " is $" +ticketPrice);





    }
}
