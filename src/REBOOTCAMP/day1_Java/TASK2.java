package REBOOTCAMP.day1_Java;

public class TASK2 {


        /**
         * Write a program that will count how many times "java" is found in any given String
         */

        public static int javaCount(String str){
            int java = 0;
            for (int i = 0; i < str.length()-3; i++){
                if (str.substring(i,i+4).equalsIgnoreCase("java"))
                    java++;
                }
                return java;
            }

        public static int javaCount2(String str){
            int java = 0;
            while (str.contains("java")){
                java++;
                str = str.toLowerCase().replaceFirst("java", "");
            }
            return java;
        }

    public static void main(String[] args) {

        System.out.println("Java count is: " + javaCount("Java is the best! Java is not easy but it's fun. Java"));
        System.out.println("Java count2 is: " + javaCount2("I love java. Java is my favorite programming language"));
}
}

