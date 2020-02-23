package day10_switch_logical_operators;

public class SpeedingCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 66;

        if (currentSpeed > 90) {
            System.out.println("Jail Time");
        }else if (currentSpeed > 80) {
        System.out.println("Reckless Driving");
        }else if (currentSpeed > 70) {
            System.out.println("Speeding Ticket and points");
        }else if (currentSpeed >60) {
            System.out.println("Warning");
        } else {
            System.out.println("Keep driving and thinking Java");

        }
    }
}
