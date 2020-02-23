package OfficeHours;

public class StringReview {
    public static void main(String[] args) {
        /*
        Task:
            Given String word
            find and print the length
            Print the first letter
            Print the last letter
            print the word in all uppercase
            print the word in all lowercase
            Print first part of the word
            print second part of the word
            Print true if word contains 'a'
            Replace the first char with * and print result
            Delete all spaces from beginning and end of the word and print result
            Print true if your word is "Java"
         */

        String word = "Java coders ";
        // find and print the length

        int length = word.length();
        System.out.println("Length is: " + length);

        //Print the first letter

        System.out.println("First char is: " + word.charAt(0));
        char lastChar = word.charAt(length - 1); //last char is always length is - 1
        //because we start our index from 0
        //but we start the count fro, 1

        //print the last char
        System.out.println("Last char is: " + lastChar);

        //print the word in all uppercase
        System.out.println(word.toUpperCase());
        //print the word in all lowercase
        System.out.println(word.toLowerCase());

        //Print first part of the word
        //if word length is not even - include bigger part
        //java javac
        //if odd add 1 to be substring (0, length ()/2+1)
        //length %2 == 0 -> if even (8%2==0) == 0 -> true

        String result;

        if (length % 2 == 0) {
            result = word.substring(0, length / 2);
        } else {
            result = word.substring(0, length / 2 + 1);
        }
        System.out.println(result);

        //print second part of the word
        //print the longer part if word length is odd
        //java javac
        //0123 01234
        //4/2 5/2

        System.out.println(word.substring(length / 2));

        //Print true if word contains 'a'
        //contains() -> returns boolean

        if (word.contains("a")) {
            System.out.println(true);
        }

        //Replace the first char with * and print result

        System.out.println(word.replaceFirst(word.charAt(0) + "", "*")); // second option
        System.out.println("*" + word.substring(1)); //first option

        // regex is regular expression RTA - 223

        //trim only deletes the spaces from the beginning and the end
        System.out.println(word.trim());
        // For instance " java" -> "java"
        //              " java " -> "java"
        //             "          ja va       " -> "ja va"


        //print true if your word is "Java"

        if (word.equals("Java")) {
            System.out.println(true);
        }
        //Print true if your word is "Java" regardless of the case

        if (word.equalsIgnoreCase("JAVA")){
            System.out.println(true);
    }

    /*
    StringBuilder - read about it offline
     */


      //    Reverse the word  (chars in word)

        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));

        }

        /*
        revers word by words in sentence
        "I love java"
        "java love I"
         */

        String  sentence = "I love food";

        //  split () is a String method which returns array

        String [] arr = sentence.split(" ");
        // ["I", "love", "food"]

        System.out.println("");
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }








        }



    }
