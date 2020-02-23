package day37_arraylist;
import java.util.ArrayList;
public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<String>  shoppingList = new ArrayList<>();
        //check if list is empty
        System.out.println("isEmpty() - " + shoppingList.isEmpty());
        System.out.println("size() == 0 - " + (shoppingList.size() == 0));

        if (shoppingList.isEmpty()){
            System.out.println("List is Empty, nothing to buy. Keep coding java");
        } else {
            System.out.println("List is not Empty. Time to go to code Java");
        }

        shoppingList.add("Apple Laptop");
        shoppingList.add("Tesla");
        shoppingList.add("Sport shoes");
        shoppingList.add("T shirt");
        shoppingList.add("Jacket");
        shoppingList.add("Hat");
        shoppingList.add("Wooden Spoon");

        //Check if list is still empty. Run if statement again

        if (shoppingList.isEmpty()){
            System.out.println("List is Empty, nothing to buy. Keep coding java");
        } else {
            System.out.println("List is not Empty. Code Java and go to mall");
        }

        //get count and assign into variable count

        int count = shoppingList.size();
        System.out.println(count);

        //check if "Jacket" is among the items

        if (shoppingList.contains("Jacket")){
            System.out.println("Jacket is in the shopping list");
        } else {
            System.out.println("Jacket is not in the shopping list");
        }


        System.out.println( shoppingList.contains(5)); // read it as an object
        System.out.println( shoppingList.contains("cellphone")); // false does not contain

        // find index of "Tesla" , Apple Laptop, Hat

        System.out.println(shoppingList.indexOf("Tesla"));
        System.out.println(shoppingList.indexOf("Apple Laptop"));
        System.out.println(shoppingList.indexOf("Hat"));

        //remove everything

        shoppingList.clear();
        System.out.println(shoppingList);


    }
}
