package day44_static;

import java.util.ArrayList;
import java.util.Arrays;

public class Starbucks {

    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking " + coffeeObj.getName() + " and coding java");
    }

    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing " +coffeeSize + " " + coffeeName);
        Coffee readyCoffee = new Coffee(coffeeName, coffeeSize, 0.99);
        return readyCoffee;
    }

    //Method: drinkCofee
    //param : Coffee cof
    public static void main(String[] args) {
        Coffee cappuccino = new Coffee("cappuccino", "Grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        //syntax for array of Coffees
        Coffee[] coffeArray = new Coffee[2];
        coffeArray[0] = cappuccino;
        coffeArray[1] = new Coffee("Latte", "Venti", 5.99);

        System.out.println(Arrays.toString(coffeArray));

        //Arraylist of Coffees
        ArrayList<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeArray[1]);
        coffeeList.add(new Coffee("Nitro Brew", "Tall", 3.49));

        System.out.println(coffeeList.toString());

        //drink first coffee
        coffeeList.get(0).drink();

        //drink all of them
        //loop

        for (Coffee each : coffeeList) {
            each.drink();
        }

        System.out.println("------------CALL CUSTOM METHOD - DRINK COFFEE------------");
        Coffee hotChocolate = new Coffee("Hot Chocolate", "Venti", 4.99);
        //call the method and pass the Coffee object
        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);
        drinkCoffee(new Coffee("Mocha", "Tall", 4.79));




        }

    }

