package day32_custommethods;

public class SimpleMethod {
    public static void main(String[] args){
        System.out.println("hello");
        displayMessage(); // call or use the custom method
        displayMessage();
        System.out.println("yes");
}

    public static void displayMessage(){
        System.out.println("Hello World from my method!");
    }

}
