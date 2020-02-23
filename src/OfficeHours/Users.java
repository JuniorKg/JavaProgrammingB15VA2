package OfficeHours;

import java.util.Arrays;

public class Users {
    public static void main(String[] args) {
        String [] users = {"1, John, 25, 243-342-2342",
                           "2, Kevin, 34, 565-565-0000",
                           "3, Alexis, 27, 123-321-1111",
                            "4, Josh, 31, 321-532-4931",
                            "5, Trevor, 45, 324-422-1212"};

        String user1 = users[0];
        System.out.println(user1);

        String [] user1Array = users[0].split(", ");
        System.out.println(Arrays.toString(user1Array));
        String user1PhoneNumber = user1Array[3];
        System.out.println(user1PhoneNumber);

        for (String user : users){
            String name = user.split(", ")[1];
            System.out.println(name);

        }
        int oldest = 0;
        //if I want to find the oldest user
        for (String user : users){
            // this line will convert string into integer
            int age = Integer.parseInt(user.split(", ")[2]);

            if (age >oldest){
                oldest= age;

            }
        }
        System.out.println("Max age: " + oldest);
       /*
       package day_17_12_18_2019;
public class Users2 {
    public static void main(String[] args) {
        //user_id, user_name, age, phone_number
        String[] users = {"1, John, 25, 243-342-2342",
                "2, Kevin, 34, 565-565-0000",
                "3, Paul, 50, 234-121-1111",
                "4, Mark, 42, 877-532-2342",
                "5, Trevor, 22, 234-222-8779",
                "6, Aeron, 50, 999-991-3453",
        };
        //we have to find out max age
        int maxAge = Integer.MIN_VALUE;
        for (String user : users) {
            int age = Integer.parseInt(user.split(", ")[2]);
            if (age > maxAge) {
                maxAge = age;
            }
        }
        String listOfOldestUsers = "";
        for (String user : users) {
            int age = Integer.parseInt(user.split(", ")[2]);
            if (maxAge == age) {
                listOfOldestUsers += user.substring(user.indexOf(", ") + 2,
                        user.lastIndexOf(",")) + "\n";
            }
        }
        System.out.println("List of oldest users:\n" + listOfOldestUsers);
    }
}
        */
    }
}
