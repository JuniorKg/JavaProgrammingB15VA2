//package OfficeHours;
//import java.util.*;
//public class MethodsPractice {
//    public static void main(String[] args) {
//
//        int num1 = 5;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 0;
//
//        EvenorOdd(num1);
//        EvenorOdd(num2);
//        EvenorOdd(num3);
//        EvenorOdd(num4);
//        EvenorOdd(num5);
//        charsCountinString("java", 'a');
//
//        String[] arr = {"Apple", "Umbrella"},'H');
//
//        startsWithGivenChar(new String[] {"House", "Horse", "Fruit"}, 'H');
//
//
//        /*
//        Void methods - do not return any value but do some actions
//
//        any data type can be an argument/parameter/input
//
//        public static void methodName(Data Type and name){
//        }
//            .charAt(int index) < method with parameter
//
//            public static void methodName (){
//
//            .toUpperCase() < method with no parameters
//
//            Why do we need methods
//            - to avoid code redundancy
//            - easier to maintain
//            -Class behavior - each class can have different behaviors which's gonna belong to that class
//         */
//
//        /*
//        we have 5 numbers (int [] arr)
//        print if each of the number of an array is
//        even or odd
//         */
//        //instead of writing if statement for each number
//        // we can write a method and call this method for every number
//        /*
//        Write a method which prints an amount of times
//        we see some char in some String
//
//        Java (a) - print 2
//        apple (j) - print 0
//
//        1. create count = 0
//        2. loop through Strings and do count++ when
//
//                char in String . equals to the given char
//         */
//
//    }
//
//
//        public static void EvenorOdd(int num) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is Even");
//            } else {
//                System.out.println(num + " is Odd");
//            }
//        }
//        public static void charsCountinString(String word, char letter) {
//            int count = 0;
//            for (int i = 0; i < word.length(); i++) {
//                if (word.charAt(i) == letter) {
//                    count++;
//                }
//            }
//
//                System.out.println(word + " has " + letter + " " + count);
//
//            }
//
//                        /*
//                    Write the method which takes a String array
//                    check if word in array starts with "A"
//                    - if yes print the word
//                    - if not say "not the word we targeted
//
//                    Steps :
//
//                    1. for loop
//                    2. if statement th
//
//                    */
//        public static void startsWithGivenChar(String [] arr, char givenChar) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].startsWith(givenChar +"")) { // arr[i].startsWith(ch+ "")
//                    System.out.println(arr[i].equalsIgnoreCase(arr[i]));
//                }else {
//                    System.out.println("Not the word we targeted");
//
//            }
//        }
//
//
//
//
//
//        }
//}
//


