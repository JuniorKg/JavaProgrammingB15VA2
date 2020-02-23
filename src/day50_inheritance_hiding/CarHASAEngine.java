package day50_inheritance_hiding;

public class CarHASAEngine {
    public static void main(String[] args) {
        Engine myCarEngine = new Engine("m50b25", 192, 6);
        System.out.println(myCarEngine.toString());

        Car bmw = new Car("BMW 525i", myCarEngine);
        System.out.println(bmw.getEngine().toString());


        Engine gtEngine = new Engine("m256", 577, 8);
        Car toyota = new Car("Toyota 312d", gtEngine);

        System.out.println(gtEngine.toString());

      //  Car corolla = new Car();
      //  corolla.setModel("Toyota Corolla");
      //  corolla.setEngine(new Engine("Corolla Engine", 180, 4));


    }
}

