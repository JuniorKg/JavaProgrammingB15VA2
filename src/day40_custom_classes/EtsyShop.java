package day40_custom_classes;

public class EtsyShop {
    public static void main(String[] args) {

        //Declare 2 Product objects
        Product prodObj1 = new Product();
        Product prodObj2 = new Product();


        // assign values to prodObj1
        prodObj1.title = "Wooden Banana";
        prodObj1.price = 4.5;
        prodObj1.rating = 5;
        prodObj1.seller = "BananaSeller";

        prodObj2.title = "Wool Gloves";
        prodObj2.price = 25.44;
        prodObj2.rating = 4;
        prodObj2.seller = "WoolSeller";

        // prodObj2.freeShipping = false; ERROR: this variable not in Product class;

        //print values from prodObj1
        System.out.println("prodObj1.title = " + prodObj1.title);
        System.out.println("prodObj1.price = " + prodObj1.price);
        System.out.println("prodObj1.rating = " + prodObj1.rating);
        System.out.println("prodObj1.seller = " + prodObj1.seller);

        prodObj1.displayInfo();




    }
}
