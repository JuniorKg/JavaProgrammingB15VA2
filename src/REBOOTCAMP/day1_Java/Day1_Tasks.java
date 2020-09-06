package REBOOTCAMP.day1_Java;

public class Day1_Tasks {
    public static void main(String[] args) {



        for (int i = 1; i <= 30; i++) {
            String temp = "";
            if (i % 3 == 0)
                temp = "FIN";
            if (i % 5 == 0)
                temp += "RA";

            if (temp.isEmpty()) {
               System.out.println(i);
            } else {
                System.out.println(temp);
            }
        }
    }


    public static void finra(int num) {
        for (int i = 1; i <= num; i++) {
            String temp = "";
            if (i % 3 == 0)
                temp = "FIN";
            if (i % 5 == 0)
                temp += "RA";
            if (temp.isEmpty())
                System.out.println(i);
             else {
                System.out.println(temp);
            }
        }

        }
    }

