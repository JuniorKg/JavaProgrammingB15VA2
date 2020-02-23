package OfficeHours;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {

        /*
            ask user to enter age of 3 people - name of each person
            find the youngest one among 3
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter person 1 name");
        String name1 = scan.next();

        System.out.println("Please enter person 1 age");
        int age1 = scan.nextInt();

        System.out.println("Please enter person 2 name");
        String name2 = scan.next();
        System.out.println("Please enter person 2 age");
        int age2 = scan.nextInt();

        System.out.println("Please enter person 3 name");
        String name3 = scan.next();
        System.out.println("Please enter person 3 age");
        int age3 = scan.nextInt();

        /*
           10 10 12
           10 10 10

           10 12 10
           12 10 10
           12 15 10
           10 15 12
           10 12 15
           15
         */
        if (age1 <1 || age2<1 || age3<1) {
            System.out.println("One or two of the indicated ages is invalid");
        }else if(age1 == age2 && age1 ==age3) {
            System.out.println("All ages are the same");
        }else if (age1 ==age2 && age1<age3) {
            System.out.println(name1 + " and " + name2 + " same age, and are the youngest");
        }else if (age1==age3 && age1<age2) {
            System.out.println(name1 + " and " + name3 + " same age, and are the youngest");
        }else if (age2==age3 && age2<age1) {
            System.out.println(name2 + " and " + name3 + " same age, and are the youngest");
        }else if (age1 < age2 && age1 < age3) {
            System.out.println(name1 + " is the youngest");
        }else if (age2 < age1 && age2 < age3) {
            System.out.println(name2 + " is the youngest");
        }else if (age3 < age1 && age3 <age2) {
            System.out.println(name3 + " is the youngest");

        }else {
            System.out.println("Wrong Input");



        }

    }
}
