package day23_arraysday2;

public class StudentsList {
    public static void main(String[] args) {

        String[] students = new String[9];

        students[0] = "Irma";
        students[1] = "Viola";
        students[2] = "Katya";
        students[3] = "Aika";
        students[4] = "Edil";
        students[5] = "Ilay";
        students[6] = "John";
        students[7] = "Anton";
        students[8] = "Catalina";

        String[] students2 = {"Irma", "Viola", "Katya",
                "Aika", "Edil", "Ilay", "John",
                "Anton", "Catalina"};

        //print students count
        //"Total students: students.length

        System.out.println("Total students: " + students.length);
        //print first student:
        System.out.println("First student : " + students[0]);

        //using For loop print.
        //Irma >> 4
        //Viola >> 5
        //Katya >> 5
        //Aika >> 4
        //Edil >>4
        System.out.println(students[0].toUpperCase());
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + ". " + "Student name: " + students[i] + " >> " + students[i].length());
        }
        int count = 0;
        for (String friend : students) {
            count++;
            System.out.println(count + ". " + friend + " >> " + friend.length());
        }

        String allFriends = "";
        for (String friend : students) {
            allFriends += friend + ", ";
        }
        //remove last ", "
        allFriends = allFriends.substring(0, allFriends.length() - 2);
        System.out.println(allFriends);

        // Print 2 friends at a time

        for (int i = 0; i < students.length; i += 2) {
            //System.out.println("i :" + i);
            if (i == students.length - 1) {
                System.out.println(students[i]);
            } else {
                System.out.println(students[i] + ", " + students[i + 1]);

            }


        }

    }
}








