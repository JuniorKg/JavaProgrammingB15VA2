package day51_abstraction;

public class Tesla extends ElectricCar {
    //public abstract void start();

    public void start(){
        System.out.println("You can start your Tesla by pressing on the brake pedal and putting into gear");
        System.out.println("Change to Drive MODE");
    }

    //public abstract void charge();
    public void charge(){
        System.out.println("Tesla charging - Plugin to Electric outlet");

    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");

    }

}

