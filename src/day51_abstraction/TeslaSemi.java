package day51_abstraction;

public class TeslaSemi extends ElectricTruck {


    @Override
    public void load(String item) {
        System.out.println("TeslaSemi - load " + item + " using" + " by lowering the truck and opening door");

    }

    @Override
    public void start() {
        System.out.println("TeslaSemi - start truck by pressing a button");
    }

    @Override
    public void charge() {
        System.out.println("TeslaSemi - plugin charge over for 1 day");

    }

    @Override
    public void drive() {
        System.out.println("TeslaSemi - truck is driving with load...");

    }
}
