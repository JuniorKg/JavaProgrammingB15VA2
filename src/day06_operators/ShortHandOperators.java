package day06_operators;

import jdk.swing.interop.SwingInterOpUtils;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 15;
        System.out.println("Car in parking lot: " +cars);
        cars = cars +2;
        System.out.println("Car in parking lot: " +cars);
        cars +=3; //add 3 more to cars
        System.out.println("Car in parking lot: " +cars);

        cars = cars -1;
        System.out.println("Car in parking lot: " +cars);

        cars -=2;
        System.out.println("Car in parking lot: " +cars);

        cars*=3;
        System.out.println("Car in parking lot: " +cars);

        cars/=2;
        System.out.println("Car in parking lot: " +cars);

        //------------------------------------
        int carsBack =20;
        cars+= carsBack;   //cars = cars + carsBack
        System.out.println("Car in parking lot: " +cars);
        System.out.println("CarsBack in parking lot: " +carsBack);

        String letters = "A";
        System.out.println("Letters: " +letters);

        letters = letters + "B";
        System.out.println("Letters: "+letters);

        letters +="CD";
        System.out.println("Letters: " +letters);

        ///letters -= "CD"; WILL NOT WORK

        int apples = 10;
        apples %= 3;
        System.out.println("Apples left: " +apples);





    }
}
