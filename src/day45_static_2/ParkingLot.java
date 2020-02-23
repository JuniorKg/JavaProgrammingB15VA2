package day45_static_2;

public class ParkingLot {
    public static void main(String[] args) {
        //print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicles);
       // System.out.println(Vehicle.model); Model is non-static and its private

        Vehicle v1 = new Vehicle("Tesla Cybertruck");
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);

        Vehicle v2 = new Vehicle ("Ford f150");

        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);



    }
}
