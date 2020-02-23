package MyPractice;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey \"Java\",What's the temperature today? ");
        int temp = input.nextInt();
        System.out.println("Is it \"F\" or \"C\"?");
        String name = input.next();
        System.out.println("OK, then today's temperature is " +temp+name);











    }
}
