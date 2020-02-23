package MyPractice;
import java.util.*;
public class Assginment_106M {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        String firstName = json.substring(json.indexOf("firstName") + 13, json.indexOf("\","));
        String lastName = json.substring(json.indexOf("lastName") + 12, json.indexOf("\",", json.indexOf("lastName")));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);


    }

}