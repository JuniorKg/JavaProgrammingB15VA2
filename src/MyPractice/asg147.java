package MyPractice;
import java.util.*;
public class asg147 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);

    }

    public static void person(String info) {
        //your code here

        String[] wordsArray = info.split(",");
        String name = wordsArray[0];
        String lastName = wordsArray[1];
        String age = wordsArray[2];
        System.out.println(name + " last name: " + lastName + " age: " + age);
    }
}
