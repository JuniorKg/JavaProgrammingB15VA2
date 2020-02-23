package day16_memory_while_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word.charAt(2));
                /*
                Find out number of characters in String
               use that number as input to CharAt method (-1)
                 */
        System.out.println(word.length());
        System.out.println(word.charAt(word.length()-1));

        int count = word.length(); //5
        System.out.println(word.charAt(count-1));




    }
}
