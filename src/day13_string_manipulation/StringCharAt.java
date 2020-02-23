package day13_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "Cybertek";

        System.out.println(company.length());
        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));

        //---------------------------------------------

        //store first letter into first variable
        char first = company.charAt(0);
        System.out.println("first = " + first);

        // check if first character is 'C'
        // Print 'C' is first letter '    'C' is not first letter'

        if (company.charAt(0) == 'C'){  // Or  first == 'C'
            System.out.println("C is first letter ");
        }else {
            System.out.println("C is not first letter");
        }
                           //01234
        String word = "civic"; //palindrome word
        //read first and last characters and store into firstL, lastL variables

        //put a condition if they match. if yes -> "fist and last match" , "first and last do not match"

        //put a condition if they match.

        char firstL = word.charAt(0);
        char lastL = word.charAt(4);

        if (firstL == lastL) {
            System.out.println("first and last letters match");
        }else {
            System.out.println("first and last letters do not match ");
        }

            System.out.println(word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) +
                    " " + word.charAt(4));
        }



        //


    }

