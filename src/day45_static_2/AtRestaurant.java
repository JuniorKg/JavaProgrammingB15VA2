package day45_static_2;

public class AtRestaurant {
    public static void main(String[] args) {
        Dinner mom = new Dinner();
        Dinner dad = new Dinner();
        Dinner kid = new Dinner();

        System.out.println("Total slices: " + Dinner.pizzaSlices);

        kid.takeASlice();
        mom.takeASlice();
        dad.takeASlice(2);

        System.out.println("Total slices: " + Dinner.pizzaSlices);
        System.out.println("Kid: " + kid.pizzaSlices);
        System.out.println("Mom: " + mom.pizzaSlices);
        System.out.println("Dad: " + dad.pizzaSlices);


        kid.takeASlice(2);
        mom.takeASlice();
        dad.takeASlice();

        System.out.println("Total slices: " + Dinner.pizzaSlices);
        System.out.println("Kid: " + kid.pizzaSlices);
        System.out.println("Mom: " + mom.pizzaSlices);
        System.out.println("Dad: " + dad.pizzaSlices);
    }
}
