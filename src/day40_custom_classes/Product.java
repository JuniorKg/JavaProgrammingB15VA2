package day40_custom_classes;

public class Product {

    /*
      Properties of the product. We declare them in the class and outside any method
       */
    String title;
    Double price;
    int rating;
    String seller;
    boolean bestSeller;
    //custom method to act as behavior for Product class

    public  void displayInfo(){
        System.out.println("--- Product info ---");
        System.out.println("title = " + title);
        System.out.println("price = " + price);
        System.out.println("seller = " + seller);
        System.out.println("----------------");

    }

    /*
    Syntax : Classname varName = new ClassName();
     */
    public static void main(String[] args) {


        Product prod1 = new Product();
        prod1.title = "Wooden Spoon";
        prod1.price = 14.99;
        prod1.rating = 5;
        prod1.seller = "Memento";
        prod1.bestSeller = false;

        Product prod2 = new Product();
        prod2.title = "Plastic Spoon";
        prod2.price = 3.99;

        prod2.rating = 5;
        prod2.seller = "Memento";
        prod2.bestSeller = true;


        //how to read values from obeject

        System.out.println(prod1.title);
        System.out.println(prod1.price);
        System.out.println(prod1.rating);
        System.out.println(prod1.seller);
        System.out.println(prod1.bestSeller);

    }
}
