package day45_static_2;

public class Vehicle {
    private String model;
    public static int numberOfVehicles = 0; //static variable no need for



    public Vehicle(){
        System.out.println("Parking a Unknown model Vehicle");
        numberOfVehicles++;

    }

    public Vehicle(String model) {
        System.out.println("Parking: " + model);
        this.model = model;
        numberOfVehicles++;
    }

    public static void setNumberOfVehicles(int numberOfVehicles) {
        Vehicle.numberOfVehicles = numberOfVehicles;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }


    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';

    }
}


