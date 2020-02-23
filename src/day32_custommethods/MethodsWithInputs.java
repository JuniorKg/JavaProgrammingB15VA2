package day32_custommethods;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayMessage("Java is fun");
        displayMessage("Coding Java today");
        greetByname("Nina");
        greetByname("Arman");
        greetByname("Edil");
        count(6);
    }

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
    }

    public static void greetByname(String name) {
        System.out.println("Hello, " + name + ", how are you?");
    }

    public static void count(int num){
        for (int z = 0; z < num ; z++) {
            System.out.print(z + " ");
        }
    }
}




