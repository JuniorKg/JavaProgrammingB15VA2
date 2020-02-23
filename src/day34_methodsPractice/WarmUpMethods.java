package day34_methodsPractice;

public class WarmUpMethods {
    public static void main(String[] args) {
        login("student@cybertek.com", "cybertekb15");

        drive("honda", (77));
    }


    public static void login(String userName, String password) {
        String validUsername = "student@cybertek.com";
        String validPassword = "cybertekb15";

        if (userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Successful, Welcome to Cybertek!");
        } else {
            System.out.println("ERROR: Login Failed - Invalid credentials!");
        }
    }

    public static void drive(String car, int speed) {

        if (speed < 0){
            System.out.println("Invalid Speed, cannot be negative");
        } else if (speed == 0){
            System.out.println(car + " is not moving at " + speed + " mph");
        } else if (speed <= 55){
            System.out.println(car + " is driving at " + speed + " mph");
        } else if (speed > 55 && speed < 200){
            System.out.println(car + " is speeding at " + speed + " mph");
        } else if (speed > 200){
            System.out.println(car + " is flying at " + speed + " mph");
        }
    }

}