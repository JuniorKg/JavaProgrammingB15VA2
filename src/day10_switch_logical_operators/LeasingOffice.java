package day10_switch_logical_operators;

public class LeasingOffice {
    public static void main(String[] args) {
        System.out.println("Welcome to CyberTek Appartments!");
        int numberOfBedrooms = 3;
        double startingPrice = 0.0;

        switch(numberOfBedrooms) {
            case 0:
                System.out.println("Studio is selected");
                startingPrice = 1200.0;
                break;
            case 1:
                System.out.println("One Bedroom is selected");
                startingPrice = 1400.0;
                break;
            case 2:
                System.out.println("Two Bedroom is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("Three bedroom is selected");
                startingPrice = 2250.0;
                break;
            default:
                System.out.println("No such bedroom available");
        }
                System.out.println("StartingPrice: " +startingPrice);
        }
    }

    /*

     */