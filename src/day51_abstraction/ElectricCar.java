package day51_abstraction;

public abstract class ElectricCar {
    public abstract void start();//WHAT TODO, instead of how TODO. HIDE IMPLEMENTATION
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car is stopping by pushing break...");
    }


    /**
     * Where we do we write implementation for abstract methods in abstract class?
     *
     * Sub classes of abstract class are responsible for implementation of ALL abstract methods.
     *
     * ABSTRACT CLASS -> CONCRETE CLASS
     */

    String model;
    double price;
    String color;


}




