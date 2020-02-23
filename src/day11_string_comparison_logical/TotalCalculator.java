package day11_string_comparison_logical;

public class TotalCalculator {
    public static void main(String[] args) {
        String vehicleType = "car";


        boolean isRushHour = true;

        double tollPrice = 0;

        if (vehicleType.equals("car") && !isRushHour)
        {   tollPrice = 3.0;
            System.out.println(" car and no rush Hour");
        }else if (vehicleType.equals("car") && isRushHour) {
            tollPrice = 7.50;
            System.out.println("Vehicle Type: Car and Rush Hour");
        } else if (vehicleType.equals("truck") && !isRushHour) {
            tollPrice = 4.75;
            System.out.println("Vehicle Type: Truck and Not Rush Hour");
        } else if (vehicleType.equals("truck") && isRushHour) {
            tollPrice = 11.50;
            System.out.println("Vehicle Type: Truck and Rush Hour");
        } else {
            System.out.println("Vehicle is not recognized");
        }
            System.out.println("Toll price: $" +tollPrice);

        }

    }

