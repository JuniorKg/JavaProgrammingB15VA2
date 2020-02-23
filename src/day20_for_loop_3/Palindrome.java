package day20_for_loop_3;

public class Palindrome {
    public static void main(String[] args) {
        /*
        IQ: Palindrome:
    Race Car
    Civic
    Mom
-> case differences are ignores
-> spaces are ignored
-> convert the word into all lowercase
-> get rid of spaces
String reversed = "";
String word = "Ja va";
ja va
word = "java"
------
avaj
reversed = "avaj"
------
Compare if reversed matches word
    true: 
        Print "madam is Palindrome"
    false:
        Print "java is Not Palindrome"

         */
        
        String word = "Race Car ";
        
        word = word.toLowerCase();
        System.out.println(word);

        word = word.replace(" ", "");
        System.out.println(word);

        // reversing the string and assigning to reversed variable
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i-- ) {
            System.out.print(word.charAt(i));
            reversed += word.charAt(i);
        }
            System.out.println("\nreversed: " +reversed);

            if (word.equals(reversed)){
                System.out.println(word +" word is Palindrome ");
            } else {
                System.out.println(word + " word is not Palindrome");
        }
        }
    }  

