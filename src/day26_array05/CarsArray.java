package day26_array05;

public class CarsArray {
    public static void main(String[] args) {
        String[] myCars = {"Ford", "Chevy", "Toyota", "Honda", "Mazda", "Kia", "Hyundai", "BMW", "Audi", "Mercedes",
                "Fiat", "Ferrari", "Alfa Romeo", "Bugatti", "Renault"};

        for (int i = 0; i < myCars.length; i++) {
            if (myCars[i].equals("Ford") || myCars[i].equals("Chevy")) {
                System.out.println("American: " + myCars[i]);
            } else if (myCars[i].equals("Toyota") || myCars[i].equals("Honda") || myCars[i].equals("Mazda")) {
                System.out.println("Japanese: " + myCars[i]);
            } else if (myCars[i].equals("Kia") || myCars[i].equals("Hyundai")) {
                System.out.println("Korean: " + myCars[i]);
            } else if (myCars[i].equals("BMW") || myCars[i].equals("Audi") || myCars[i].equals("Mercedes")) {
                System.out.println("German: " + myCars[i]);
            } else if (myCars[i].equals("Fiat") || myCars[i].equals("Ferrari") || myCars[i].equals("Alfa Romeo")) {
                System.out.println("Italy: " + myCars[i]);
            } else if (myCars[i].equals("Bugatti") || myCars[i].equals("Renault")) {
                System.out.println("French: " + myCars[i]);
            } else {
                System.out.println("Unknown Car");



            }
        }
    }
}
