package REBOOTCAMP.day2_Java;

/**
 * Create a method that will accept a number and determine
 * if the number of palindrome or not.
 */
public class Task3_Palindrome {

    public static boolean isPalindrome(int num){
        int remain = num; //12321
        int rev = 0; // 1

        while (remain !=0){
            int digit = remain % 10; //2

            rev =rev* 10  + digit; // 0 * 10 -> 0 + 1
            remain/=10;




        }

        return num == rev;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));

    }


}
