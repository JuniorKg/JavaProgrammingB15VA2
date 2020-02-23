package day51_abstraction;

public class ElectricCarObjects {
    public static void main(String[] args) {
       // ElectricCar elc1 = new ElectricCar(); compile ERROR! Cannot be instantiated.
        Tesla modelS = new Tesla();

        modelS.charge();
        modelS.start();
        modelS.drive();


        Ford fusion = new Ford();

        fusion.charge();
        fusion.start();
        fusion.drive();

        TeslaSemi truck = new TeslaSemi();

        truck.charge();
        truck.start();
        truck.drive();
        truck.load("load");




    }
}
