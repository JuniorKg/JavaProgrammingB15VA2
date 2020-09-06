package REBOOTCAMP.day1_Java;

public class task3Palindrome {
    public static void main(String[] args) {

        /**
         * Write a program
         */

        System.out.println(verifyPalindrome("mom") ? "Palindrome" : "Not Palindrome");
//        String str = "abcdcba";
//        boolean check = true;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != str.charAt(str.length()-1-i)){
//                check = false;
//                break;
//            }
//        }
//        System.out.println(check ? "Palindrome" : "Not Palindrome");
//    }
    }

        public static boolean verifyPalindrome(String str){
         boolean check = true;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                 check = false;
                 break;
             }
         }
             return check;
         }
        }
