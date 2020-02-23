package day16_memory_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word = "abc"; //always 3 character
        String reversed = ""; //vaj

        System.out.println(word.charAt(2));
        reversed+= word.charAt(2);
        System.out.println("reversed = " + reversed);

        System.out.println(word.charAt(1));
        reversed+=word.charAt(1);
        System.out.println("reversed = " + reversed);

        System.out.println(word.charAt(0));
        reversed+=word.charAt(0);
        System.out.println("reversed = " + reversed);

        String reversed2 = "";

        reversed2 = reversed2+word.charAt(2) + word.charAt(1) +word.charAt(0);
        System.out.println("reversed2 = " +reversed2);

        System.out.println("" +word.charAt(2) + word.charAt(1) +word.charAt(0));
        
        if(word.equals(reversed)){
            System.out.println("Palindrome 3letter word");
        }else {
            System.out.println("Non-palindrome 3 letter word");
        }
    }
}
