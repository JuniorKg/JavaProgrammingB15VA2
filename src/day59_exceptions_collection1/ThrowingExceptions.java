package day59_exceptions_collection1;

import day56_exceptions.TryCatch;

import javax.lang.model.UnknownEntityException;
import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        //create object of Arithmetic exception
        System.out.println(getWeekDayName(5));

        try {
            System.out.println(getWeekDayName(8));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument was handled");
            System.out.println(e.getMessage());
            System.out.println(getWeekDayName(1));
        }
        try {
            throw new IOException("IOException");
        } catch (Exception e){
            System.out.println("Exception is caught");
            System.out.println(e.getMessage());
        }

        ArithmeticException ar = new ArithmeticException();
        RuntimeException ar2 = new ArithmeticException("cannot divide by 0");
        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());
        //throw ar;

        String userName = "Christmas";

        if (userName.isEmpty()) {
            throw new RuntimeException("Username cannot be empty");
        } else {
            System.out.println("Username is valid");
        }

        int age = 20;
        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            throw new IllegalArgumentException("Ineligible to vote");
        }

        int month = 10;

        if (month >= 1 && month <= 12) {
            System.out.println("valid month - " + month);
        } else {
            throw new RuntimeException("Invalid month - " + month);
        }


        int[] nums = {44, 55, 11};
        int index = 2;

        if (index < 0 || index >= nums.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index " + index);
        } else {
            System.out.println("index " + index + ", value " + nums[index]);
        }

        String firstName = "Nadir";

        if (firstName == null) {
            throw new NullPointerException("firstName cannot be null");
        }

        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));

        }
    }



    public static String getWeekDayName(int day) {
        String weekday = "";
        if (day == 1)
            weekday = "Monday";
        else if (day == 2)
            weekday = "Tuesday";
        else if (day == 3)
            weekday = "Wednesday";
        else if (day == 4)
            weekday = "Thursday";
        else if (day == 5)
            weekday = "Friday";
        else if (day == 6)
            weekday = "Saturday";
        else if (day == 7)
            weekday = "Sunday";
        else
            throw new IllegalArgumentException("Invalid day: " + day);
        return weekday ;
    }
}

