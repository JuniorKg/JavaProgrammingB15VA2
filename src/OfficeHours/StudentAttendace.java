package OfficeHours;
import java.util.Scanner;
public class StudentAttendace {
    public static void main(String[] args) {

        /*
        Task
            Student will not be allowed to take exam if attendace is <75%

            2 input - use Scanner:
            numOfClasses - int
            classesAttend - int

            find attendace percentage and print if student is allowed to take exam

            ___________________________________

            1st example with if statement
            2nd - ternary
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter number of classes");
        int numOfClasses = scan.nextInt();

        System.out.println("Please enter number of classes attended");
        int classesAttend = scan.nextInt();

        int percentage = classesAttend*100/numOfClasses;
        System.out.println(" Attendace percentage = " + percentage);

        if(percentage>=75) {
            System.out.println("You can take an exam");
        }else {
            System.out.println("You cannot take an exam. You have to retake the course");
        }
        //ternary
        // (condition)? true: false;

        System.out.println((percentage>=75)? "Pass": "Fail");




        




    }
}
